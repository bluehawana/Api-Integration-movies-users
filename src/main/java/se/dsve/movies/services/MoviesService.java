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
        return null;
    }

    public Optional<Movies> getMoviesById(Long id) {
        // TODO: Implement function
        return null;
    }

    public Movies addMovies(MoviesDto moviesDto) {
        // TODO: Implement function
        return null;
    }

    public Movies updateMovies(Long id, MoviesDto moviesDto) {
        // TODO: Implement function
        return null;
    }

    public void deleteMovies(Long id) {
        // TODO: Implement function
    }

    private Movies getMoviesOrFail(Long id) {
        // TODO: Implement function
        return null;
    }

    public void addPredefinedMovies() {
        // TODO: Implement function
    }
}
