package uceva.cleanarchitecture.infrastructure.datasource;

import com.github.javafaker.Faker;
import uceva.cleanarchitecture.domain.entity.Movie;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MovieDatasource {

    private Faker faker = new Faker();
    private final Random random = new Random();

    private final String[] genres = {
            "Accion",
            "Comedia",
            "Drama",
            "Terror",
            "Ciencia Ficcion",
            "Aventura"
    };

    public List<Movie> getAll(int countMovies) {
        List<Movie> movies = new ArrayList<Movie>();
        for (int i = 1; i <= countMovies; i++) {
            movies.add(generateMovie(i));
        }
        return movies;
    }

    private Movie generateMovie(Integer id) {
        return new Movie(
                id,
                faker.book().title(),
                randomGenre(),
                faker.number().numberBetween(1990, 2026)
        );
    }

    private String randomGenre() {
        return genres[random.nextInt(genres.length)];
    }
}