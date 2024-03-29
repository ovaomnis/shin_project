package kg.ows.shin.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.UUID;

@Data
public class CategoryDTO {
    private UUID id;
    @NotBlank
    private String name;
}
