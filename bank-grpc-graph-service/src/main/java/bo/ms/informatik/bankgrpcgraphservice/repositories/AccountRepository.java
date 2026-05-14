package bo.ms.informatik.bankgrpcgraphservice.repositories;

import bo.ms.informatik.bankgrpcgraphservice.entities.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, String>, CustomAccountRepository {

}
