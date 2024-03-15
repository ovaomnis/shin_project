package kg.ows.shin.service;

import jakarta.persistence.EntityNotFoundException;
import kg.ows.shin.dto.PositionDTO;
import kg.ows.shin.entities.Position;
import kg.ows.shin.exceptions.NotFoundException;
import kg.ows.shin.mapper.PositionMapper;
import kg.ows.shin.repositories.PositionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class PositionServiceJPA implements PositionService {
    PositionRepository positionRepository;
    PositionMapper positionMapper;

    @Override
    public PositionDTO getPositionById(UUID id) {
        Position position = positionRepository.findById(id).orElseThrow(() -> new NotFoundException("Not Found"));
        return positionMapper.toDto(position);
    }

    @Override
    public List<PositionDTO> getList() {
        Iterable<Position> positions = positionRepository.findAll();
        List<PositionDTO> positionDTOList = new ArrayList<>();
        for (Position position: positions) {
            positionDTOList.add(positionMapper.toDto(position));
        }
        return positionDTOList;
    }
}
