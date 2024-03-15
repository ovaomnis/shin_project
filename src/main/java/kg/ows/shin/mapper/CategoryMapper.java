package kg.ows.shin.mapper;

import kg.ows.shin.dto.CategoryDTO;
import kg.ows.shin.entities.Category;
import org.mapstruct.Mapper;

@Mapper
public interface CategoryMapper {
    Category toEntity (CategoryDTO categoryDto);
    CategoryDTO toDto (Category category);
}
