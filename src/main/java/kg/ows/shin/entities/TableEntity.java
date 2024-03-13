package kg.ows.shin.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Setter
@Getter
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class TableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Builder.Default
    private Boolean reserved = false;

    @OneToMany(mappedBy = "table")
    private Set<Session> sessions;
}
