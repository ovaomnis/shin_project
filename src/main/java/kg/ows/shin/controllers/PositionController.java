package kg.ows.shin.controllers;

import jakarta.validation.Valid;
import kg.ows.shin.dto.PositionDTO;
import kg.ows.shin.service.PositionServiceJPA;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/position")
@RequiredArgsConstructor
public class PositionController {
    private final PositionServiceJPA positionServiceJPA;

    @GetMapping
    public List<PositionDTO> list() {
        return positionServiceJPA.getList();
    }

    @GetMapping("{position_id}")
    public PositionDTO retrieve(@PathVariable UUID position_id) {
        return positionServiceJPA.getById(position_id);
    }

    @PostMapping
    public PositionDTO create(@RequestBody @Valid PositionDTO positionDTO) {
        return positionServiceJPA.create(positionDTO);
    }

    @PutMapping("{position_id}")
    public PositionDTO fullUpdate(@RequestBody @Valid PositionDTO positionDTO, @PathVariable UUID position_id) {
        return positionServiceJPA.fullUpdate(positionDTO, position_id);
    }
}
