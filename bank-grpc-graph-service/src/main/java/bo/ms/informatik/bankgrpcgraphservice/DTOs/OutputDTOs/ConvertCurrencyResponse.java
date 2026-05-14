package bo.ms.informatik.bankgrpcgraphservice.DTOs.OutputDTOs;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class ConvertCurrencyResponse {
    private String currencyFrom;
    private String currencyTo;
    private double amount;
    private double conversionResult;
}
