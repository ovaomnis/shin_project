package kg.ows.shin.bootstrap;


import kg.ows.shin.entities.Category;
import kg.ows.shin.entities.Position;
import kg.ows.shin.repositories.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.*;

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
    @Transactional
    public void run(String... args) throws Exception {
        initializeFromCsv();
    }

    public Set<Category> getOrCreateCats(String[] cats) {
        Set<Category> categories = new HashSet<>();
        for (String cat: cats) {
            Optional<Category> category = categoryRepository.findByName(cat.trim());
            if (category.isPresent()) {
                categories.add(category.get());
            } else {
                Category createdCat = categoryRepository.save(Category.builder().name(cat.trim()).build());
                categories.add(createdCat);
            }
        }
        return categories;
    }

    public void initializeFromCsv() throws Exception {
        ArrayList<Position> positions = new ArrayList<>();
        String file = "src/main/resources/data/positions.csv";
        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(";");
                ;
                String[] cats = row[3].substring(1, row[3].length() - 1).split(",");
                Position position = Position.builder()
                        .name(row[0])
                        .description(row[1].substring(1, row[1].length() - 1))
                        .price(new BigDecimal(row[2]))
                        .build();
                Set<Category> categories = getOrCreateCats(cats);
                position.setCategories(categories);
                positions.add(position);
            }
            positionRepository.saveAll(positions);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}
