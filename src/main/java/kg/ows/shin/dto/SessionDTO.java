package kg.ows.shin.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Data
public class SessionDTO {
    private UUID id;
    private LocalDateTime opened;
    private LocalDateTime closed;
    private BigDecimal total_price;
    private TableDTO table;
}
