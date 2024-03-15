package kg.ows.shin.controllers;

import kg.ows.shin.dto.PositionDTO;
import kg.ows.shin.service.PositionServiceJPA;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/position")
@RequiredArgsConstructor
public class PositionController {
    private final PositionServiceJPA positionServiceJPA;
    @GetMapping
    public List<PositionDTO> list() {
        return  positionServiceJPA.getList();
    }
    @GetMapping("{position_id}")
    public PositionDTO retrieve(@PathVariable UUID position_id) {
        return positionServiceJPA.getPositionById(position_id);
    }
}
