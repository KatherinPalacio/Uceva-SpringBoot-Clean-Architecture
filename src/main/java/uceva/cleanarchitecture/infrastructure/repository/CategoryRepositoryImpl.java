package uceva.cleanarchitecture.infrastructure.repository;

import org.springframework.stereotype.Repository;
import uceva.cleanarchitecture.domain.entity.Category;
import uceva.cleanarchitecture.domain.repository.CategoryRepository;
import uceva.cleanarchitecture.infrastructure.datasource.CategoryDatasource;

import java.util.List;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    private final CategoryDatasource categoryDatasource;

    public CategoryRepositoryImpl(CategoryDatasource categoryDatasource) {
        this.categoryDatasource = categoryDatasource;
    }

    @Override
    public List<Category> getAll(int count) {
        return categoryDatasource.getAll(count);
    }
}