package bo.ms.informatik.bankgrpcgraphservice.repositories;

import bo.ms.informatik.bankgrpcgraphservice.DTOs.InputDTOs.UpdateAccountRequest;
import bo.ms.informatik.bankgrpcgraphservice.entities.Account;
import bo.ms.informatik.bankgrpcgraphservice.entities.Currency;
import org.springframework.graphql.data.method.annotation.Argument;

public interface CustomAccountRepository {
    public Account updateAccount(UpdateAccountRequest updateRequest, Account account);

}
