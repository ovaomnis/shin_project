package kg.ows.shin.repositories;

import kg.ows.shin.entities.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CategoryRepository extends CrudRepository<Category, UUID> {
}
