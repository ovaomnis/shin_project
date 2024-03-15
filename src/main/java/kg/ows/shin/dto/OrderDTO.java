package kg.ows.shin.dto;

import kg.ows.shin.entities.OrderEntity;
import kg.ows.shin.entities.Position;
import kg.ows.shin.entities.Session;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Data
public class OrderDTO {
    private UUID id;
    private OrderEntity.OrderStage stage;
    private Position position;
    private Session session;
}
