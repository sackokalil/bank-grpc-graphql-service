package bo.ms.informatik.bankgrpcgraphservice.mappers.grpc;

import bo.ms.informatik.bankgrpcgraphservice.entities.Currency;
import bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank;
import org.springframework.stereotype.Service;

@Service
public class CurrencyMapperImpl {
    public Bank.Currency toGrpcCurrency(Currency currency) {
        Bank.Currency grpCurrency = Bank.Currency.newBuilder()
                .setId(currency.getId())
                .setName(currency.getName())
                .setSymbol(currency.getSymbol())
                .setPrice(currency.getPrice())
                .build();
        return grpCurrency;
    }
    public Currency fromGrpcCurrencyRequest(Bank.AddCurrencyRequest request) {
        Currency currency = new Currency();
        currency.setName(request.getName());
        currency.setSymbol(request.getSymbol().toUpperCase());
        currency.setPrice(request.getPrice());

        return currency;
    }
}
