package kg.ows.shin.repositories;

import kg.ows.shin.entities.TableEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TableRepository extends CrudRepository<TableEntity, UUID> {
}
