package uceva.cleanarchitecture.infrastructure.datasource;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;
import uceva.cleanarchitecture.domain.entity.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class CategoryDatasource {

    private Faker faker = new Faker();
    private final Random random = new Random();

    private final String[] categoryNames = {
            "Estrenos",
            "Populares",
            "Recomendadas",
            "Clasicas",
            "Familiares",
            "Documentales"
    };

    public List<Category> getAll(int countCategories) {
        List<Category> categories = new ArrayList<Category>();
        for (int i = 1; i <= countCategories; i++) {
            categories.add(generateCategory(i));
        }
        return categories;
    }

    private Category generateCategory(Integer id) {
        return new Category(
                id,
                randomCategoryName(),
                faker.lorem().sentence()
        );
    }

    private String randomCategoryName() {
        return categoryNames[random.nextInt(categoryNames.length)];
    }
}