package bo.ms.informatik.bankgrpcgraphservice.DTOs.OutputDTOs;

import bo.ms.informatik.bankgrpcgraphservice.enums.TransactionStatus;
import bo.ms.informatik.bankgrpcgraphservice.enums.TransactionType;
import lombok.Builder;
import lombok.Data;

@Data @Builder
public class Transaction {
    private String id;
    private String accountId;
    private long timestamp;
    private double amount;
    private TransactionType type;
    private TransactionStatus status;
}

