package uceva.cleanarchitecture.infrastructure.controller;

import org.springframework.web.bind.annotation.*;
import uceva.cleanarchitecture.application.usecase.GetAllCategoriesUseCase;
import uceva.cleanarchitecture.domain.entity.Category;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final GetAllCategoriesUseCase getAllCategoriesUseCase;

    public CategoryController(GetAllCategoriesUseCase getAllCategoriesUseCase) {
        this.getAllCategoriesUseCase = getAllCategoriesUseCase;
    }

    @GetMapping("/{count}")
    public List<Category> getAll(@PathVariable int count) {
        return getAllCategoriesUseCase.execute(count);
    }
}