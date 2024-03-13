package kg.ows.shin.repositories;

import kg.ows.shin.entities.Session;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface SessionRepository extends CrudRepository<Session, UUID> {
}
