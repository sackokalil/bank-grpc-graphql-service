package bo.ms.informatik.bankgrpcgraphservice.graphQL;

import bo.ms.informatik.bankgrpcgraphservice.DTOs.InputDTOs.CreateAccountRequest;
import bo.ms.informatik.bankgrpcgraphservice.entities.Account;
import bo.ms.informatik.bankgrpcgraphservice.entities.Currency;
import bo.ms.informatik.bankgrpcgraphservice.enums.AccountStatus;
import bo.ms.informatik.bankgrpcgraphservice.enums.AccountType;
import bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank;
import bo.ms.informatik.bankgrpcgraphservice.mappers.graphql.AccountMapperImpl;
import bo.ms.informatik.bankgrpcgraphservice.repositories.AccountRepository;
import bo.ms.informatik.bankgrpcgraphservice.repositories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Service;

@Service
public class MutationImpl {

}
