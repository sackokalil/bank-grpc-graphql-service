package bo.ms.informatik.bankgrpcgraphservice.DTOs.InputDTOs;

import bo.ms.informatik.bankgrpcgraphservice.enums.AccountStatus;
import bo.ms.informatik.bankgrpcgraphservice.enums.AccountType;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class CreateAccountRequest {
    private double balance;
    private AccountStatus state;
    private AccountType type;
    private String currencySymbol;
}
