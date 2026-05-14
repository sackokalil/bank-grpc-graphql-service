package bo.ms.informatik.bankgrpcgraphservice.entities;


import bo.ms.informatik.bankgrpcgraphservice.enums.AccountStatus;
import bo.ms.informatik.bankgrpcgraphservice.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Data @NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "bank_account")
public class Account {
    @Id
    private String id;
    private double balance;
    private long createdAt;
    private AccountStatus status;
    private AccountType type;
    private Currency currency;


}
