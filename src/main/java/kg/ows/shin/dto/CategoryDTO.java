package kg.ows.shin.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Data
public class CategoryDTO {
    private UUID id;
    private String name;
}
