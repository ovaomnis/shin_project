package kg.ows.shin.repositories;

import kg.ows.shin.entities.Position;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PositionRepository extends CrudRepository<Position, UUID> {
}
