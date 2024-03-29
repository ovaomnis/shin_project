package kg.ows.shin.service;

import kg.ows.shin.dto.PositionDTO;

import java.util.List;
import java.util.UUID;

public interface PositionService {
    PositionDTO getById(UUID id);

    List<PositionDTO> getList();

    PositionDTO create(PositionDTO positionDto);

    PositionDTO fullUpdate(PositionDTO positionDTO, UUID positionId);
}
