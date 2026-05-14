package bo.ms.informatik.bankgrpcgraphservice.grpc.service;

import bo.ms.informatik.bankgrpcgraphservice.entities.Account;
import bo.ms.informatik.bankgrpcgraphservice.entities.AccountTransaction;
import bo.ms.informatik.bankgrpcgraphservice.entities.Currency;
import bo.ms.informatik.bankgrpcgraphservice.enums.TransactionStatus;
import bo.ms.informatik.bankgrpcgraphservice.enums.TransactionType;
import bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank;
import bo.ms.informatik.bankgrpcgraphservice.grpc.stub.BankServiceGrpc;
import bo.ms.informatik.bankgrpcgraphservice.mappers.grpc.AccountTransactionMapperImpl;
import bo.ms.informatik.bankgrpcgraphservice.mappers.grpc.BankAccounMapperImpl;
import bo.ms.informatik.bankgrpcgraphservice.mappers.grpc.CurrencyMapperImpl;
import bo.ms.informatik.bankgrpcgraphservice.repositories.AccountRepository;
import bo.ms.informatik.bankgrpcgraphservice.repositories.AccountTransactionRepository;
import bo.ms.informatik.bankgrpcgraphservice.repositories.CurrencyRepository;
import com.google.protobuf.Empty;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.ServerCallStreamObserver;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.stream.Collectors;

//this class should inherit a class located in stub/BankServiceGrpc named "BankServiceImplBase"
//this name comes from the name of the services declaration in the .proto file to which the compiler added "ImpleBase"
// so ==> BankServiceImplBase;the name  "BankService" is declared in bank.proto
@GrpcService
public class BankGrpcServiceImpl extends BankServiceGrpc.BankServiceImplBase {

    @Autowired
    private BankAccounMapperImpl accountMapper;
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private CurrencyRepository currencyRepository;
    @Autowired
    private CurrencyMapperImpl currencyMapper;
    @Autowired
    private AccountTransactionRepository transactionRepository;
    @Autowired
    private AccountTransactionMapperImpl accountTransactionMapper;
    @Autowired
    private AccountTransactionRepository accountTransactionRepository;

    //================Account related Implementation=============================
    @Override
    public void createAccount(Bank.CreateAccountRequest request, StreamObserver<Bank.BankAccount> responseObserver) {
        try {
                Account account = accountMapper.fromGrpcAccountRequest(request);
                Account savedAccount = accountRepository.save(account);
                Bank.BankAccount bankAccount = accountMapper.toGrpcAccount(savedAccount);
                responseObserver.onNext(bankAccount);
                responseObserver.onCompleted();
            }catch (StatusRuntimeException e){
                responseObserver.onError(e);
        }catch (Exception e){
            responseObserver.onError(Status.INTERNAL.withCause(e).asRuntimeException());
        }
    }

    @Override
    public void getAccount(Bank.GetAccountRequest request, StreamObserver<Bank.GetAccountResponse> responseObserver) {

        try {
                Account account = accountRepository.findById(request.getAccountId()).orElse(null);
                if(account == null) {
                    throw Status.NOT_FOUND.withDescription("Account not found").asRuntimeException();
                }
                Bank.BankAccount bankAccount = accountMapper.toGrpcAccount(account);
                Bank.GetAccountResponse getAccountResponse = Bank.GetAccountResponse.newBuilder()
                        .setAccount(bankAccount)
                        .build();
                responseObserver.onNext(getAccountResponse);
                responseObserver.onCompleted();

        }catch (StatusRuntimeException e){
            responseObserver.onError(e);
        }

    }

    @Override
    public void getListAccounts(Bank.GetListAccountRequest request, StreamObserver<Bank.GetListAccountResponse> responseObserver) {
        List<Account> accountList = accountRepository.findAll();
        List<Bank.BankAccount> grpcAccountList = accountList.stream().map(account -> accountMapper.toGrpcAccount(account)).collect(Collectors.toList());
        Bank.GetListAccountResponse listAccountResponse = Bank.GetListAccountResponse.newBuilder()
                .addAllBankAccounts(grpcAccountList)
                .build();
        responseObserver.onNext(listAccountResponse);
        responseObserver.onCompleted();

    }


    //====================Currency related implementation=====================

    @Override
    public void addCurrency(Bank.AddCurrencyRequest request, StreamObserver<Bank.AddCurrencyResponse> responseObserver) {
        Currency currency =  currencyMapper.fromGrpcCurrencyRequest(request);
        Currency savedCurrency = currencyRepository.save(currency);
        Bank.Currency grpcCurrency = currencyMapper.toGrpcCurrency(savedCurrency);
        Bank.AddCurrencyResponse addCurrencyResponse = Bank.AddCurrencyResponse.newBuilder()
                .setCurrency(grpcCurrency)
                .build();
        responseObserver.onNext(addCurrencyResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getCurrency(Bank.GetCurrencyRequest request, StreamObserver<Bank.GetCurrencyResponse> responseObserver) {
       try {
               Currency currency = currencyRepository.findById(request.getCurrencyId()).orElse(null);
               if (currency == null) {
                   //Raise an exception in case the currency is not found
                   throw Status.NOT_FOUND.withDescription("Currency not found").asRuntimeException();
               }
               Bank.Currency grpcCurrency = currencyMapper.toGrpcCurrency(currency);
               Bank.GetCurrencyResponse getCurrencyResponse = Bank.GetCurrencyResponse.newBuilder()
                       .setCurrency(grpcCurrency)
                       .build();
               responseObserver.onNext(getCurrencyResponse);
               responseObserver.onCompleted();

       }catch (StatusRuntimeException e) {
           responseObserver.onError(e);
       }
    }

    @Override
    public void getListCurrencies(Empty request, StreamObserver<Bank.GetListCurrencyResponse> responseObserver) {
        List<Currency> currencyList = currencyRepository.findAll();
        List<Bank.Currency> grpcCurrencyList = currencyList.stream().map(currency -> currencyMapper.toGrpcCurrency(currency)).collect(Collectors.toList());

        Bank.GetListCurrencyResponse listCurrencyResponse = Bank.GetListCurrencyResponse.newBuilder()
                .addAllCurrencies(grpcCurrencyList)
                .build();
        responseObserver.onNext(listCurrencyResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void convertCurrency(Bank.ConvertCurrencyRequest request, StreamObserver<Bank.ConvertCurrencyResponse> responseObserver) {
        try {
                Currency from = currencyRepository.findBySymbol(request.getCurrencyFrom().toUpperCase());
                if (from == null) {
                    //raise an exception in case the currency is not foud
                    throw Status.NOT_FOUND.withDescription("One of or both of the Currencies not found").asRuntimeException();
                }
                Currency to = currencyRepository.findBySymbol(request.getCurrencyTo().toUpperCase());
                if (to == null) {
                    //raise an exception in case the currency is not foud
                    throw Status.NOT_FOUND.withDescription("One of or both of the Currencies not found").asRuntimeException();
                }

                double amount = request.getAmount();
                double conversionResult = (amount * from.getPrice())/ to.getPrice();
                Bank.ConvertCurrencyResponse convertCurrencyResponse = Bank.ConvertCurrencyResponse.newBuilder()
                        .setCurrencyFrom(from.getSymbol())
                        .setCurrencyTo(to.getSymbol())
                        .setAmount(amount)
                        .setConversionResult(conversionResult)
                        .build();
                responseObserver.onNext(convertCurrencyResponse);
                responseObserver.onCompleted();

        }catch (StatusRuntimeException e){
            responseObserver.onError(e);
        }

    }


    //==========================Transaction related implementation===============


    @Override
    public void getStreamOfTransactions(Bank.GetStreamOfTransactionsRequest request, StreamObserver<Bank.Transaction> responseObserver) {
        //retrieve the list of transactions associated with the account received
        List<AccountTransaction> transactionList = transactionRepository.findByAccountId(request.getAccountId());
        if (transactionList.isEmpty()) {
            responseObserver.onError(Status.NOT_FOUND.withDescription("No transactions found Or the account with ID: "
                            + request.getAccountId() + " does not existe").asRuntimeException());
            return;
        }
        //create a list of grpc transaction from the list of Mongo transactions
        List<Bank.Transaction> grpcTransactionList =transactionList.stream()
                .map(transaction -> accountTransactionMapper.toGrpcTransaction(transaction))
                .collect(Collectors.toList());
        //a stack where transactions should be popped one after another
        Stack<Bank.Transaction> transactionStack = new Stack<>();
        transactionStack.addAll(grpcTransactionList);

        //Timer for streaming
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Bank.Transaction transaction = transactionStack.pop();
                responseObserver.onNext(transaction);
                if (transactionStack.isEmpty()) {
                    responseObserver.onCompleted();
                    timer.cancel();
                }
            }
        }, 0, 1000);

    }

    @Override
    public StreamObserver<Bank.Transaction> performStreamOfTransactions(StreamObserver<Bank.PerformStreamOfTransactionsResponse> responseObserver) {

        //This list will be used to perform aggregations after we receive the stream of transactions from client.
        List<AccountTransaction> accountTransactionList = new ArrayList<>();

        return new StreamObserver<Bank.Transaction>() {
            @Override
            public void onNext(Bank.Transaction transaction) {
                try {
                        //each grpc transaction received will be turned to Mongo Document transaction, saved into DB and added to the list
                        //created above for further computation
                        AccountTransaction accountTransaction = accountTransactionMapper.fromGrpcTransaction(transaction);
                        accountTransaction.setStatus(TransactionStatus.EXECUTED);
                        accountTransactionList.add(accountTransaction);
                        accountTransactionRepository.save(accountTransaction);
                }catch (StatusRuntimeException e){
                    responseObserver.onError(e);
                }

            }

            @Override
            public void onError(Throwable throwable) {
                responseObserver.onError(throwable);
            }

            @Override
            public void onCompleted() {
                //data for performStreamOfTransactionsResponse
                double totalCreditTransactionAmount=0;
                double totalDebitTransactionAmount=0;

                //now that we received everything from client, it's time to prepare the response.
                for (AccountTransaction transaction : accountTransactionList){
                    if(transaction.getType().equals(TransactionType.CREDIT)){
                        totalCreditTransactionAmount += transaction.getAmount();
                    }else {
                        totalDebitTransactionAmount += transaction.getAmount();
                    }
                }
                Bank.PerformStreamOfTransactionsResponse response = Bank.PerformStreamOfTransactionsResponse.newBuilder()
                        .setTotalTransactionAmount(totalCreditTransactionAmount + totalDebitTransactionAmount)
                        .setTotalCreditTransactionAmount(totalCreditTransactionAmount)
                        .setTotalDebitTransactionAmount(totalDebitTransactionAmount)
                        .setTotalTransactionCount(accountTransactionList.size())
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
        }

    @Override
    public StreamObserver<Bank.Transaction> executeStreamOfTransactions(StreamObserver<Bank.Transaction> responseObserver) {
        return new StreamObserver<Bank.Transaction>() {

            @Override
            public void onNext(Bank.Transaction transaction) {
                //the transaction amount should be greater than 100
                if (transaction.getAmount()>100){
                    Bank.Transaction transactionResponse = Bank.Transaction.newBuilder()
                            .setAmount(transaction.getAmount())
                            .setStatus(Bank.TransactionStatus.EXECUTED)
                            .build();
                    responseObserver.onNext(transactionResponse);

                }
                else responseObserver.onError(Status.INTERNAL.withDescription("Transaction amount must be greater than 100")
                        .asRuntimeException());
            }

            @Override
            public void onError(Throwable throwable) {
                responseObserver.onError(throwable);

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();

            }
        };
    }
}


