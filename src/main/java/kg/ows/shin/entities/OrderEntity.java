package kg.ows.shin.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Setter
@Getter
@ToString
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Enumerated(EnumType.STRING)
    OrderStage stage;

    @ManyToOne
    private Position position;

    @ManyToOne
    private Session session;

    public static enum OrderStage {IN_QUEUE, IN_PROCESS, READY}
}
