package bo.ms.informatik.bankgrpcgraphservice.repositories;

import bo.ms.informatik.bankgrpcgraphservice.entities.Currency;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CurrencyRepository extends MongoRepository<Currency, String> {
    public Currency findBySymbol(String symbol);
}
