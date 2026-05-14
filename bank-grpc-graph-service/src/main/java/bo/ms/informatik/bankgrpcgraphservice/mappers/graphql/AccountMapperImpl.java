package bo.ms.informatik.bankgrpcgraphservice.mappers.graphql;

import bo.ms.informatik.bankgrpcgraphservice.DTOs.InputDTOs.CreateAccountRequest;
import bo.ms.informatik.bankgrpcgraphservice.entities.Account;
import bo.ms.informatik.bankgrpcgraphservice.entities.Currency;
import bo.ms.informatik.bankgrpcgraphservice.enums.AccountStatus;
import bo.ms.informatik.bankgrpcgraphservice.enums.AccountType;
import bo.ms.informatik.bankgrpcgraphservice.repositories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//this mapper is used for graphQL context
@Service
public class AccountMapperImpl {
    @Autowired
    private CurrencyRepository currencyRepository;

    public Account toEntityAccount(CreateAccountRequest createRequest) {
        Currency currency = currencyRepository.findBySymbol(createRequest.getCurrencySymbol().toUpperCase());
        if (currency == null) {
            throw new RuntimeException("The given CurrencySymbol: '" + createRequest.getCurrencySymbol()+"' was not found");
        }
        Account account = Account.builder()
                .balance(createRequest.getBalance())
                .type(AccountType.valueOf(createRequest.getType().toString()))
                .status(AccountStatus.valueOf(createRequest.getState().toString()))
                .createdAt(System.currentTimeMillis())
                .currency(currency)
                .build();
        return account;
    }
}
