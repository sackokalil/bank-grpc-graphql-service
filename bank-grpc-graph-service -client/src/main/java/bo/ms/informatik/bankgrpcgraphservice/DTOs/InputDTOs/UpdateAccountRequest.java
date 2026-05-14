package bo.ms.informatik.bankgrpcgraphservice.DTOs.InputDTOs;

import bo.ms.informatik.bankgrpcgraphservice.enums.AccountStatus;
import bo.ms.informatik.bankgrpcgraphservice.enums.AccountType;

import lombok.Data;

@Data
public class UpdateAccountRequest {

    //private String accountId;
    private AccountType type;
    private AccountStatus state;

}
