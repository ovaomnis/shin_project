package kg.ows.shin.service;

import kg.ows.shin.dto.PositionDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PositionService {
    PositionDTO getPositionById(UUID id);

    List<PositionDTO> getList();
}
