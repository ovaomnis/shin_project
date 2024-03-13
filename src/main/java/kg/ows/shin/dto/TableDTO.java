package kg.ows.shin.dto;

import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Data
public class TableDTO {
    UUID id;
    Boolean reserved;
    Set<SessionDTO> sessions;
}
