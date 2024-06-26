package kg.ows.shin.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@Entity
@Setter
@Getter
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(length = 36)
    @EqualsAndHashCode.Include
    private UUID id;
    private String name;
    private String description;
    private BigDecimal price;

    @OneToMany(mappedBy = "position")
    private Set<OrderEntity> orders;

    @ManyToMany
    private Set<Category> categories;
}
