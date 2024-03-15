package kg.ows.shin.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@Data
public class PositionDTO {
    private UUID id;
    private String name;
    private String description;
    private BigDecimal price;
    private Set<CategoryDTO> categories;
}
