package bo.ms.informatik.bankgrpcgraphservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@EnableMongoRepositories(basePackages = "bo.ms.informatik.bankgrpcgraphservice.repositories")
public class BankGrpcGraphServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankGrpcGraphServiceApplication.class, args);
	}


}
