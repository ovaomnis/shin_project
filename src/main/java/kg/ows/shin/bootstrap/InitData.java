package kg.ows.shin.bootstrap;

import kg.ows.shin.entities.Category;
import kg.ows.shin.entities.Position;
import kg.ows.shin.repositories.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Component
@RequiredArgsConstructor
@Slf4j
public class InitData implements CommandLineRunner {

    public final CategoryRepository categoryRepository;
    public final OrderRepository orderRepository;
    public final PositionRepository positionRepository;
    public final SessionRepository sessionRepository;
    public final TableRepository tableRepository;

    @Override
    public void run(String... args) throws Exception {

        Category burgerCat = Category.builder()
                .name("Burgers")
                .build();

        Category burgerCatSaved = categoryRepository.save(burgerCat);

        Set<Category> categories = new HashSet<>();
        categories.add(burgerCat);

        Position macChickenPosition = Position.builder()
                .price(new BigDecimal("12.33"))
                .description("Lorem Ipsum")
                .categories(categories)
                .build();

        positionRepository.save(macChickenPosition);

    }

}
