package bo.ms.informatik.bankgrpcgraphservice;

import bo.ms.informatik.bankgrpcgraphservice.entities.Account;
import bo.ms.informatik.bankgrpcgraphservice.entities.AccountTransaction;
import bo.ms.informatik.bankgrpcgraphservice.enums.TransactionStatus;
import bo.ms.informatik.bankgrpcgraphservice.enums.TransactionType;
import bo.ms.informatik.bankgrpcgraphservice.repositories.AccountRepository;
import bo.ms.informatik.bankgrpcgraphservice.repositories.AccountTransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@SpringBootApplication
//@EnableMongoRepositories(basePackages = "bo.ms.informatik.bankgrpcgraphservice.repositories")
public class BankGrpcGraphServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankGrpcGraphServiceApplication.class, args);
	}
	/*@Bean
	CommandLineRunner runner(AccountTransactionRepository transactionRepository, AccountRepository accountRepository) {
		return args -> {
			List<Account> accounts = accountRepository.findAll();
			accounts.forEach(account -> {
				for (int i=0; i<10; i++) {
					AccountTransaction accountTransaction = AccountTransaction.builder()
							.status(TransactionStatus.PENDING)
							.account(account)
							.timestamp(System.currentTimeMillis())
							.amount(Math.random() * 100)
							.type(Math.random()>0.5? TransactionType.CREDIT: TransactionType.DEBIT)
							.build();
					transactionRepository.save(accountTransaction);
				}
			});
		};
	}*/

}
