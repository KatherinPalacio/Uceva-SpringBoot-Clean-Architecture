package uceva.cleanarchitecture.application.usecase;

import org.springframework.stereotype.Service;
import uceva.cleanarchitecture.domain.entity.Category;
import uceva.cleanarchitecture.domain.repository.CategoryRepository;

import java.util.List;

@Service
public class GetAllCategoriesUseCase {

    private final CategoryRepository categoryRepository;

    public GetAllCategoriesUseCase(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> execute(int count) {
        return categoryRepository.getAll(count);
    }
}