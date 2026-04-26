package uceva.cleanarchitecture.infrastructure.controller;

import org.springframework.web.bind.annotation.*;
import uceva.cleanarchitecture.application.usecase.GetAllMoviesUseCase;
import uceva.cleanarchitecture.domain.entity.Movie;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final GetAllMoviesUseCase getAllMoviesUseCase;

    public MovieController(GetAllMoviesUseCase getAllMoviesUseCase) {
        this.getAllMoviesUseCase = getAllMoviesUseCase;
    }

    @GetMapping("/{count}")
    public List<Movie> getAll(@PathVariable int count) {
        return getAllMoviesUseCase.execute(count);
    }
}