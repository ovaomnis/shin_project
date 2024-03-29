package kg.ows.shin.service;

import kg.ows.shin.dto.CategoryDTO;
import kg.ows.shin.dto.PositionDTO;
import kg.ows.shin.entities.Category;
import kg.ows.shin.entities.Position;
import kg.ows.shin.exceptions.NotFoundException;
import kg.ows.shin.mapper.CategoryMapper;
import kg.ows.shin.mapper.PositionMapper;
import kg.ows.shin.repositories.CategoryRepository;
import kg.ows.shin.repositories.PositionRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.*;

@Service
@AllArgsConstructor
@Slf4j
public class PositionServiceJPA implements PositionService {
    PositionRepository positionRepository;
    PositionMapper positionMapper;
    CategoryRepository categoryRepository;
    CategoryService categoryService;
    CategoryMapper categoryMapper;

    @Override
    public PositionDTO getById(UUID id) {
        Optional<Position> position = positionRepository.findById(id);
        return positionMapper.toDto(position.orElseThrow(NotFoundException::new));
    }

    @Override
    public List<PositionDTO> getList() {
        Iterable<Position> positions = positionRepository.findAll();
        List<PositionDTO> positionDTOList = new ArrayList<>();
        positions.forEach(position -> {
            positionDTOList.add(positionMapper.toDto(position));
        });
        return positionDTOList;
    }

    @Override
    public PositionDTO create(PositionDTO positionDto) {
        Set<Category> categories = new HashSet<>();
        positionDto.getCategories().forEach(
                category -> categories.add(categoryMapper.toEntity(categoryService.getOrCreateByName(category)))
        );
        Position position = positionMapper.toEntity(positionDto);
        position.setCategories(categories);
        Position savedPosition = positionRepository.save(position);
        return positionMapper.toDto(savedPosition);
    }

    @Override
    public PositionDTO fullUpdate(PositionDTO positionDTO, UUID positionId) {
        Set<UUID> categoryIDs = new HashSet<>();
        Position position = positionMapper.toEntity(positionDTO);
        positionDTO.getCategories().forEach(categoryDTO -> categoryIDs.add(categoryDTO.getId()));
        position.setId(positionId);
        position.setCategories(categoryRepository.findByIdIn(categoryIDs));
        return positionMapper.toDto(positionRepository.save(position));
    }
}
