package bo.ms.informatik.bankgrpcgraphservice.repositories;

import bo.ms.informatik.bankgrpcgraphservice.DTOs.InputDTOs.UpdateAccountRequest;
import bo.ms.informatik.bankgrpcgraphservice.entities.Account;
import bo.ms.informatik.bankgrpcgraphservice.entities.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AccountRepositoryImpl implements CustomAccountRepository{

    @Override
    public Account updateAccount(UpdateAccountRequest updateRequest, Account account) {
        account.setType(updateRequest.getType());
        account.setStatus(updateRequest.getState());
        return account;
    }

}
