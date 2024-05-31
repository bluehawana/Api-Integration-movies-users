package se.dsve.movies.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.dsve.movies.dtos.MoviesDto;
import se.dsve.movies.exceptions.ResourceNotFoundException;
import se.dsve.movies.model.Movies;
import se.dsve.movies.repository.MoviesRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MoviesService {

    private final MoviesRepository moviesRepository;

    @Autowired
    public MoviesService(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    public List<Movies> getAllMovies() {
        // TODO: Implement function
        return moviesRepository.findAll();
    }

    public Optional<Movies> getMoviesById(Long id) {
        // TODO: Implement function
        return moviesRepository.findById(id);
    }

    public Movies addMovies(MoviesDto moviesDto) {
        // TODO: Implement function
        Movies movies = new Movies();
        movies.setTitle(moviesDto.getTitle());
        movies.setDirector(moviesDto.getDirector());
        movies.setRating(moviesDto.getRating());
        movies.getReleaseYear();
        movies.setGenre(moviesDto.getGenre());
        return moviesRepository.save(movies);

    }

    public Movies updateMovies(Long id, MoviesDto moviesDto) {
        // TODO: Implement function
        Movies movies = getMoviesOrFail(id);
        movies.setTitle(moviesDto.getTitle());
        movies.setDirector(moviesDto.getDirector());
        movies.setRating(moviesDto.getRating());
        movies.getReleaseYear();
        movies.setGenre(moviesDto.getGenre());
        return moviesRepository.save(movies);
    }

    public void deleteMovies(Long id) {
        // TODO: Implement function
        moviesRepository.deleteById(id);
    }

    private Movies getMoviesOrFail(Long id) {
        // TODO: Implement function
        return moviesRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Movies not found with id:" + id));
    }

    public void addPredefinedMovies() {
        // TODO: Implement function
        Movies movies1 = new Movies();
        movies1.setTitle("The Shawshank Redemption");
        movies1.setDirector("Frank Darabont");
        movies1.setRating(9.3);
        movies1.setReleaseYear(1994);
        movies1.setGenre("Drama");
        Movies movies2 = new Movies();
        movies2.setTitle("The Godfather");
        movies2.setDirector("Francis Ford Coppola");
        movies2.setRating(9.2);
        movies2.setReleaseYear(1972);
        movies2.setGenre("Crime, Drama");
        Movies movies3 = new Movies();
        movies3.setTitle("The Dark Knight");
        movies3.setDirector("Christopher Nolan");
        movies3.setRating(9.0);
        movies3.setReleaseYear(2008);
        movies3.setGenre("Action, Crime, Drama");
        Movies movies4 = new Movies();
        movies4.setTitle("The Lord of the Rings: The Return of the King");
        movies4.setDirector("Peter Jackson");
        movies4.setRating(8.9);
        movies4.setReleaseYear(2003);
        movies4.setGenre("Action, Adventure, Drama");
        Movies movies5 = new Movies();
        movies5.setTitle("Pulp Fiction");
        movies5.setDirector("Quentin Tarantino");
        movies5.setRating(8.9);
        movies5.setReleaseYear(1994);
        movies5.setGenre("Crime, Drama");
    }
}
