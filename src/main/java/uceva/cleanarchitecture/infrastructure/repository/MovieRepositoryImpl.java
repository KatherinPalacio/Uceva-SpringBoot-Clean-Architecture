package uceva.cleanarchitecture.infrastructure.repository;

import org.springframework.stereotype.Repository;
import uceva.cleanarchitecture.domain.entity.Movie;
import uceva.cleanarchitecture.domain.repository.MovieRepository;
import uceva.cleanarchitecture.infrastructure.datasource.MovieDatasource;

import java.util.List;

@Repository
public class MovieRepositoryImpl implements MovieRepository {

    private final MovieDatasource movieDatasource;

    public MovieRepositoryImpl(MovieDatasource movieDatasource) {
        this.movieDatasource = movieDatasource;
    }

    @Override
    public List<Movie> getAll(int count) {
        return movieDatasource.getAll(count);
    }
}