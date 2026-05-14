package bo.ms.informatik.bankgrpcgraphservice.entities;

import bo.ms.informatik.bankgrpcgraphservice.enums.TransactionStatus;
import bo.ms.informatik.bankgrpcgraphservice.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transactions")
@Data @AllArgsConstructor @NoArgsConstructor
@Builder
public class AccountTransaction {

    private String id;
    private long timestamp;
    double amount;
    private TransactionType type;
    private TransactionStatus status;
    private Account account;
}
