package kg.ows.shin.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Data
public class SessionDTO {
    UUID id;
    LocalDateTime opened;
    LocalDateTime closed;
    BigDecimal total_price;

    TableDTO table;
    Set<OrderDTO> orders;
}
