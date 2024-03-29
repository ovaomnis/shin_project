package kg.ows.shin.service;

import kg.ows.shin.dto.CategoryDTO;
import kg.ows.shin.entities.Category;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface CategoryService {
    CategoryDTO getOrCreateByName(CategoryDTO categoryDTO);
    Set<CategoryDTO> getList();
}
