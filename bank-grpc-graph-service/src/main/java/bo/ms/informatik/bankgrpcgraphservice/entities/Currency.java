package bo.ms.informatik.bankgrpcgraphservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data @NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "currency")
public class Currency {
    private String id;
    private String name;
    private String symbol;
    private double price;
}
