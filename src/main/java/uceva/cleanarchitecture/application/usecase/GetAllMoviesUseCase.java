package uceva.cleanarchitecture.application.usecase;

import org.springframework.stereotype.Service;
import uceva.cleanarchitecture.domain.entity.Movie;
import uceva.cleanarchitecture.domain.repository.MovieRepository;

import java.util.List;

@Service
public class GetAllMoviesUseCase {

    private final MovieRepository movieRepository;

    public GetAllMoviesUseCase(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> execute(int count) {
        return movieRepository.getAll(count);
    }
}