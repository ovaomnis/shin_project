package kg.ows.shin.repositories;

import kg.ows.shin.entities.OrderEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepository extends CrudRepository<OrderEntity, UUID> {
}
