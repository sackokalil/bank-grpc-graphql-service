package bo.ms.informatik.bankgrpcgraphservice.mapper;

import bo.ms.informatik.bankgrpcgraphservice.entities.Account;
import bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountMapperImpl extends ModelMapper {
    private ModelMapper mapper = new ModelMapper();

    public Account fromGrpcAccount(Bank.BankAccount bankAccount) {
        return mapper.map(bankAccount, Account.class);

    }
}
