package kg.ows.shin.service;

import kg.ows.shin.dto.PositionDTO;
import kg.ows.shin.entities.Position;
import kg.ows.shin.repositories.PositionRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class PositionServiceJPATest {
    @Autowired
    PositionServiceJPA positionServiceJPA;

    @Autowired
    PositionRepository positionRepository;

    @Test
    void testMapper() {
        Position position = positionRepository.findAll().iterator().next();
        log.debug(position.toString());
        assertEquals(position.getId(), position.getId());
    }
}