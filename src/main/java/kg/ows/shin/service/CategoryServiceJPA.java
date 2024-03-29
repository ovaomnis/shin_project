package kg.ows.shin.service;

import kg.ows.shin.dto.CategoryDTO;
import kg.ows.shin.entities.Category;
import kg.ows.shin.mapper.CategoryMapper;
import kg.ows.shin.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@AllArgsConstructor
public class CategoryServiceJPA implements CategoryService {
    CategoryRepository categoryRepository;
    CategoryMapper categoryMapper;
    @Override
    public CategoryDTO getOrCreateByName(CategoryDTO categoryDTO) {
        categoryDTO.setName(categoryDTO.getName().trim().toLowerCase());
        Optional<Category> category = categoryRepository.findByName(categoryDTO.getName());
        if (category.isPresent()) {
            return categoryMapper.toDto(category.get());
        } else {
            return categoryMapper.toDto(categoryRepository.save(categoryMapper.toEntity(categoryDTO)));
        }
    }

    @Override
    public Set<CategoryDTO> getList() {
        Set<CategoryDTO> categoryDTOS = new HashSet<>();
        categoryRepository.findAll().forEach(category -> categoryDTOS.add(categoryMapper.toDto(category)));
        return categoryDTOS;
    }

}
