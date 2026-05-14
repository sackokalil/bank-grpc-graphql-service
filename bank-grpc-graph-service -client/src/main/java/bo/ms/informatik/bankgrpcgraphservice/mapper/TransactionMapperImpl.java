package bo.ms.informatik.bankgrpcgraphservice.mapper;

import bo.ms.informatik.bankgrpcgraphservice.entities.AccountTransaction;
import bo.ms.informatik.bankgrpcgraphservice.grpc.stub.Bank;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class TransactionMapperImpl extends ModelMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public AccountTransaction fromGrpcTransaction(Bank.Transaction bankTransaction) {
        return modelMapper.map(bankTransaction, AccountTransaction.class);

    }
}
