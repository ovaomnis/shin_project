package kg.ows.shin.mapper;

import kg.ows.shin.dto.TableDTO;
import kg.ows.shin.entities.TableEntity;
import org.mapstruct.Mapper;

@Mapper
public interface TableMapper {
    TableEntity toEntity(TableDTO tableDTO);
    TableDTO toDto(TableEntity tableEntity);
}
