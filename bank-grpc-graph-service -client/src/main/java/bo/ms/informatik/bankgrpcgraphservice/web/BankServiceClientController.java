package bo.ms.informatik.bankgrpcgraphservice.web;

import bo.ms.informatik.bankgrpcgraphservice.entities.Account;
import bo.ms.informatik.bankgrpcgraphservice.entities.AccountTransaction;
import bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank;
import bo.ms.informatik.bankgrpcgraphservice.grpc.stub.BankServiceGrpc;
import bo.ms.informatik.bankgrpcgraphservice.mapper.AccountMapperImpl;
import bo.ms.informatik.bankgrpcgraphservice.mapper.TransactionMapperImpl;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import reactor.core.publisher.Flux;


import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BankServiceClientController {

    @GrpcClient(value = "bankService") //defined in application.properties
    private BankServiceGrpc.BankServiceBlockingStub blockingStub;

    @GrpcClient(value = "bankService")
    private BankServiceGrpc.BankServiceStub asyncStub;

    @Autowired
    private AccountMapperImpl accountMapper;
    @Autowired
    private TransactionMapperImpl transactionMapper;

    //=========================================GRPC==================================

    @GetMapping("/grpc/accounts") // with this request blockingStub will automatically connect to localhost:50051
    //(the port on which runs grpc service in the other project) and call the procedure getListAccounts()
    public List<Account> getGrpcAccounts() {
        Bank.GetListAccountRequest request = Bank.GetListAccountRequest.newBuilder().build();
        Bank.GetListAccountResponse response = blockingStub.getListAccounts(request);
        List<Bank.BankAccount> grpcAccountsList = response.getBankAccountsList();
        List<Account> accountList = grpcAccountsList.stream().map(accountMapper::fromGrpcAccount).collect(Collectors.toList());
        return accountList;
    }

    @GetMapping("/grpc/accounts/{id}")
    public Account getAccountById(@PathVariable String id) {
        Bank.GetAccountRequest request = Bank.GetAccountRequest.newBuilder().setAccountId(id).build();
        Bank.GetAccountResponse response = blockingStub.getAccount(request);
        return accountMapper.fromGrpcAccount(response.getAccount());

    }

    @GetMapping("/grpc/transaction/stream/{id}")
    public SseEmitter streamTransaction(@PathVariable String id) {
        SseEmitter emitter = new SseEmitter();
        Bank.GetStreamOfTransactionsRequest srequest = Bank.GetStreamOfTransactionsRequest.newBuilder().setAccountId(id).build();
        asyncStub.getStreamOfTransactions(srequest, new StreamObserver<Bank.Transaction>() {
            @Override
            public void onNext(Bank.Transaction transaction) {
                AccountTransaction accountTransaction = transactionMapper.fromGrpcTransaction(transaction);
                try {
                    emitter.send(accountTransaction);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public void onError(Throwable throwable) {
                emitter.completeWithError(throwable);
            }

            @Override
            public void onCompleted() {
                emitter.complete();
            }
        });


        return emitter;
    }



    //=========================================GRAPHQL==================================

    @GetMapping("/qql/accounts")
    public List<Account> getQqlAccounts() {
        HttpGraphQlClient graphQlClient = HttpGraphQlClient.builder()
                .url("http://localhost:8080/graphql")
                .build();

        var httpRequestDocument = """
                query{
                    getListAccounts
                    {
                        balance,
                        type,
                        status,
                        currency{
                            price,
                            name
                        }
                }
                }
                """;
        List<Account> listAccount = graphQlClient.document(httpRequestDocument)
                .retrieve("getListAccounts").toEntityList(Account.class).block();
        return listAccount;
    }
}
