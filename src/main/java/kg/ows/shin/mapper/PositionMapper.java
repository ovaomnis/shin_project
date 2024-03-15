package kg.ows.shin.mapper;

import kg.ows.shin.dto.PositionDTO;
import kg.ows.shin.entities.Position;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PositionMapper {
    PositionMapper INSTANCE = Mappers.getMapper(PositionMapper.class);

    PositionDTO toDto(Position position);

    Position toEntity(PositionDTO positionDto);
}
