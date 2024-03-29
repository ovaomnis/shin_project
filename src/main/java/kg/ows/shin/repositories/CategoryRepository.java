package kg.ows.shin.repositories;

import kg.ows.shin.entities.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.*;

public interface CategoryRepository extends CrudRepository<Category, UUID> {

    Optional<Category> findByName(String names);
    Set<Category> findByIdIn(Set<UUID> ids);
}
