package uceva.cleanarchitecture.domain.repository;

import uceva.cleanarchitecture.domain.entity.Movie;
import java.util.List;

public interface MovieRepository {
    List<Movie> getAll(int count);
}