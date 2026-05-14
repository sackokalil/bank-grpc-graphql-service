package bo.ms.informatik.bankgrpcgraphservice.mappers.grpc;

import bo.ms.informatik.bankgrpcgraphservice.entities.Account;
import bo.ms.informatik.bankgrpcgraphservice.entities.Currency;
import bo.ms.informatik.bankgrpcgraphservice.enums.AccountStatus;
import bo.ms.informatik.bankgrpcgraphservice.enums.AccountType;
import bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank;
import bo.ms.informatik.bankgrpcgraphservice.repositories.CurrencyRepository;
import io.grpc.Status;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class BankAccounMapperImpl {
    @Autowired
    private CurrencyRepository currencyRepository;
    @Autowired
    CurrencyMapperImpl currencyMapper;

    public Bank.BankAccount toGrpcAccount(Account account) {
        Bank.Currency grpcCurrency = currencyMapper.toGrpcCurrency(account.getCurrency());

        Bank.BankAccount bankAccount = Bank.BankAccount.newBuilder()
                .setAccountId(account.getId())
                .setBalance(account.getBalance())
                .setCreatedAt(account.getCreatedAt())
                .setType(Bank.AccountType.valueOf(account.getType().toString()))
                .setState(Bank.AccountState.valueOf(account.getStatus().toString()))
                .setCurrency(grpcCurrency)
                .build();
        return bankAccount;
    }


    public Account fromGrpcAccountRequest(Bank.CreateAccountRequest request) {
        Currency currency = currencyRepository.findBySymbol(request.getCurrencySymbol().toUpperCase());
        if (currency == null) {
            //Raise an exception in case the currency is not found
            throw Status.NOT_FOUND.withDescription("Currency not found").asRuntimeException();
        }

        Account account =  new Account();
        account.setBalance(request.getBalance());
        account.setCreatedAt(System.currentTimeMillis());
        account.setType(AccountType.valueOf(request.getType().toString()));
        account.setStatus(AccountStatus.valueOf(request.getState().toString()));
        account.setCurrency(currency);
        return account;



    }
}
