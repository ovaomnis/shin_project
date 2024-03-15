package kg.ows.shin.mapper;

import kg.ows.shin.dto.OrderDTO;
import kg.ows.shin.entities.OrderEntity;
import org.mapstruct.Mapper;

@Mapper
public interface OrderMapper {
    OrderEntity toEntity (OrderDTO orderDto);
    OrderDTO toDto (OrderEntity order);
}
