package bo.ms.informatik.bankgrpcgraphservice.DTOs.OutputDTOs;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class CurrencyDTO {
    private String id;
    private String name;
    private String symbol;
}
