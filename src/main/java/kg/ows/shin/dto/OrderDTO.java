package kg.ows.shin.dto;

import kg.ows.shin.entities.OrderEntity;
import kg.ows.shin.entities.Position;
import kg.ows.shin.entities.Session;
import lombok.Data;

import java.util.UUID;

@Data
public class OrderDTO {
    UUID id;
    OrderEntity.OrderStage stage;
    Position position;
    Session session;
}
