package kg.ows.shin.dto;

import kg.ows.shin.entities.Position;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
public class CategoryDTO {
    UUID id;
    String name;
    Set<PositionDTO> positions;
}
