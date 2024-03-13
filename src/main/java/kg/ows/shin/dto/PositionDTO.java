package kg.ows.shin.dto;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

public class PositionDTO {
    UUID id;
    String name;
    String description;
    BigDecimal price;
    Set<OrderDTO> orders;
    Set<CategoryDTO> categories;
}
