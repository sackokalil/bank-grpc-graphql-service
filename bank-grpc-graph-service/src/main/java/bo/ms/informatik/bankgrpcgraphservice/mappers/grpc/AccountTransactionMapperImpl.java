package bo.ms.informatik.bankgrpcgraphservice.mappers.grpc;

import bo.ms.informatik.bankgrpcgraphservice.entities.Account;
import bo.ms.informatik.bankgrpcgraphservice.entities.AccountTransaction;
import bo.ms.informatik.bankgrpcgraphservice.enums.TransactionStatus;
import bo.ms.informatik.bankgrpcgraphservice.enums.TransactionType;
import bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank;
import bo.ms.informatik.bankgrpcgraphservice.repositories.AccountRepository;
import io.grpc.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountTransactionMapperImpl {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private BankAccounMapperImpl bankAccounMapper;

    public Bank.Transaction toGrpcTransaction(AccountTransaction accountTransaction) {

        Bank.Transaction grpcTransaction = Bank.Transaction.newBuilder()
                .setId(accountTransaction.getId())
                .setAmount(accountTransaction.getAmount())
                .setTimestamp(accountTransaction.getTimestamp())
                .setType(Bank.TransactionType.valueOf(accountTransaction.getType().toString()))
                .setStatus(Bank.TransactionStatus.valueOf(accountTransaction.getStatus().toString()))
                .setAccountId(accountTransaction.getAccount().getId())
                .build();
        return grpcTransaction;
    }

    public AccountTransaction fromGrpcTransaction(Bank.Transaction transaction) {
        //verify if the associated account existe
        String accountId = transaction.getAccountId();
        Account account = accountRepository.findById(accountId).orElse(null);
        if (account == null) {
            throw Status.NOT_FOUND.withDescription("The account ID: " + accountId + " doesn't exist, therefore the operation can't be performed" )
                    .asRuntimeException();
        }
        //transform grpc transaction to Mongo Document Transaction(AccountTransaction)
        AccountTransaction accountTransaction = AccountTransaction.builder()
                .amount(transaction.getAmount())
                .timestamp(System.currentTimeMillis())
                .status(TransactionStatus.valueOf(transaction.getStatus().toString()))
                .type(TransactionType.valueOf(transaction.getType().toString()))
                .account(account)
                .build();
        return accountTransaction;
    }
}
