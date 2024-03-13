package kg.ows.shin.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Setter
@Getter
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDateTime opened;
    private LocalDateTime closed;
    private BigDecimal total_price;

    @ManyToOne
    private TableEntity table;

    @OneToMany(mappedBy = "session")
    private Set<OrderEntity> orders;
}
