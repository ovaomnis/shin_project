package kg.ows.shin.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Data
public class TableDTO {
    private UUID id;
    private Boolean reserved;
}
