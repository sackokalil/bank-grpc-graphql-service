package bo.ms.informatik.bankgrpcgraphservice.repositories;

import bo.ms.informatik.bankgrpcgraphservice.entities.AccountTransaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface AccountTransactionRepository extends MongoRepository<AccountTransaction, String> {
    List<AccountTransaction> findByAccountId(String accountId);
}
