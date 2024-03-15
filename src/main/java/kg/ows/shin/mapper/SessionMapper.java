package kg.ows.shin.mapper;

import kg.ows.shin.dto.SessionDTO;
import kg.ows.shin.entities.Session;
import org.mapstruct.Mapper;

@Mapper
public interface SessionMapper {
    Session toEntity (SessionDTO sessionDto);
    SessionDTO toDto (Session session);
}

