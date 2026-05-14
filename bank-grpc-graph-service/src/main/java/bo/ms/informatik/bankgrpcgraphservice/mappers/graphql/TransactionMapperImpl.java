package bo.ms.informatik.bankgrpcgraphservice.mappers.graphql;

import bo.ms.informatik.bankgrpcgraphservice.DTOs.OutputDTOs.Transaction;
import bo.ms.informatik.bankgrpcgraphservice.entities.AccountTransaction;
import bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank;
import org.springframework.stereotype.Service;

@Service
public class TransactionMapperImpl {
    public Transaction fromEntityTransaction(AccountTransaction entityTransaction){
        Transaction transaction = Transaction.builder()
                .id(entityTransaction.getId())
                .timestamp(entityTransaction.getTimestamp())
                .type(entityTransaction.getType())
                .amount(entityTransaction.getAmount())
                .status(entityTransaction.getStatus())
                .accountId(entityTransaction.getAccount().getId())
                .build();
        return transaction;
    }
}
