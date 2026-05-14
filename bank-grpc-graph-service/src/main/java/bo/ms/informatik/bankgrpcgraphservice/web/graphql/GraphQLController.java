package bo.ms.informatik.bankgrpcgraphservice.web.graphql;

import bo.ms.informatik.bankgrpcgraphservice.DTOs.InputDTOs.ConvertCurrencyRequest;
import bo.ms.informatik.bankgrpcgraphservice.DTOs.InputDTOs.CreateAccountRequest;
import bo.ms.informatik.bankgrpcgraphservice.DTOs.InputDTOs.UpdateAccountRequest;
import bo.ms.informatik.bankgrpcgraphservice.DTOs.OutputDTOs.ConvertCurrencyResponse;
import bo.ms.informatik.bankgrpcgraphservice.DTOs.OutputDTOs.CurrencyDTO;
import bo.ms.informatik.bankgrpcgraphservice.DTOs.OutputDTOs.Transaction;
import bo.ms.informatik.bankgrpcgraphservice.entities.Account;

import bo.ms.informatik.bankgrpcgraphservice.entities.AccountTransaction;
import bo.ms.informatik.bankgrpcgraphservice.entities.Currency;
import bo.ms.informatik.bankgrpcgraphservice.mappers.graphql.AccountMapperImpl;
import bo.ms.informatik.bankgrpcgraphservice.mappers.graphql.TransactionMapperImpl;
import bo.ms.informatik.bankgrpcgraphservice.repositories.AccountRepository;
import bo.ms.informatik.bankgrpcgraphservice.repositories.AccountTransactionRepository;
import bo.ms.informatik.bankgrpcgraphservice.repositories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class GraphQLController {
    @Autowired
    private AccountMapperImpl accountMapper;
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private CurrencyRepository currencyRepository;
    @Autowired
    private AccountTransactionRepository accountTransactionRepository;
    @Autowired
    TransactionMapperImpl transactionMapper;

    @MutationMapping
    public Account createAccount(@Argument CreateAccountRequest createRequest) {
        //the received Grapql CreateAccountRequest object will be automatically mapped to the corresponding
        // java CreateAccountRequeste object(DTO)  given above as argument.
        Account account =   accountMapper.toEntityAccount(createRequest);

          /* Here we return directly the mongo entity object.
        This works only if the return object declared in the graphql schema has exactly the -same
        name and the same number of- attributs as that of the mongo entity. Therefor Spring GraphQL
        knows how to automatically serialize it into a graphQL object as response.*/
        return accountRepository.save(account);

    }

    @MutationMapping
    public Account updateAccount(@Argument String accountId, @Argument UpdateAccountRequest updateRequest) {
        Account account = accountRepository.findById(accountId).orElseThrow(() -> new RuntimeException("Account not found"));
        account = accountRepository.updateAccount(updateRequest, account);
        return accountRepository.save(account) ;

    }

    @MutationMapping
    public ConvertCurrencyResponse convertCurrency(@Argument ConvertCurrencyRequest convertRequest) {
        //retrieve the two currencies and throw an exception in case not found
        Currency currencyFrom = currencyRepository.findBySymbol(convertRequest.getCurrencyFrom().toUpperCase());
        if (currencyFrom == null) {
            throw new RuntimeException("Currency not found: '" + convertRequest.getCurrencyFrom()+"'");
        }
        Currency currencyTo = currencyRepository.findBySymbol(convertRequest.getCurrencyTo().toUpperCase());
        if (currencyTo == null) {
            throw new RuntimeException("Currency not found: '" + convertRequest.getCurrencyTo()+"'");
        }
        double amount = convertRequest.getAmount();

        //conversion
        double conversionResult = (amount*currencyFrom.getPrice())/currencyTo.getPrice();


        ConvertCurrencyResponse  convertResponse = ConvertCurrencyResponse.builder()
                .amount(amount)
                .conversionResult(conversionResult)
                .currencyFrom(currencyFrom.getSymbol())
                .currencyTo(currencyTo.getSymbol())
                .build();

        return convertResponse;

    }

    @QueryMapping
    public Account getAccount(@Argument String accountId) {
        return accountRepository.findById(accountId).orElseThrow((()->new RuntimeException("Account not found")));
    }

    @QueryMapping
    public List<Account> getListAccounts() {
        return accountRepository.findAll();
    }

    @QueryMapping
    public List<Transaction> getListTransactions(){
        List<AccountTransaction> accountTransactions = accountTransactionRepository.findAll();
        List<Transaction> transactions = accountTransactions.stream().map(
                accountTransaction ->transactionMapper.fromEntityTransaction(accountTransaction) )
                .collect(Collectors.toList());

        return transactions;
    }

    /*//A resolver for only the field price
    @SchemaMapping(typeName = "Currency", field = "price")
    public double resolvePrice(CurrencyDTO currencyDTO) {
       Optional<Currency> currency = currencyRepository.findById(currencyDTO.getId());
       return currency.map(Currency::getPrice).orElse(0.0);

    }

    @QueryMapping
    *//* the fonction returns a currency without price. but the price will be retrieved by
     resolvePrice function, because the output type of graphql is defined as a Currency
     with the four attribute : name, symbol, id and price*//*
    public CurrencyDTO getResolvedCurrency(@ Argument String id) {
        Optional<Currency> currency = currencyRepository.findById(id);
        CurrencyDTO currencyDTO = CurrencyDTO.builder()
                .symbol(currency.get().getSymbol())
                .name(currency.get().getName())
                .id(currency.get().getId())
                .build();
        return currencyDTO;


    }*/



   /* @MutationMapping
    public Account deleteAccount(@Argument String accountId) {}*/


}
