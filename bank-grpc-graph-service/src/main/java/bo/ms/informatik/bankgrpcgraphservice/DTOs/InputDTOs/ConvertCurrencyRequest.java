package bo.ms.informatik.bankgrpcgraphservice.DTOs.InputDTOs;

import lombok.Data;

@Data
public class ConvertCurrencyRequest {
    private String currencyFrom;
    private String currencyTo;
    private double amount;
}
