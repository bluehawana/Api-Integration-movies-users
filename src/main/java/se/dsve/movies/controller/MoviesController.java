package se.dsve.movies.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.dsve.movies.dtos.MoviesDto;
import se.dsve.movies.exceptions.ResourceNotFoundException;
import se.dsve.movies.model.Movies;
import se.dsve.movies.services.MoviesService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movies")
public class MoviesController {

    private final MoviesService moviesService;

    public MoviesController(MoviesService moviesService) {
        this.moviesService = moviesService;
    }

    @GetMapping
    public List<Movies> getAllMovies() {
        // TODO: Implement function
        return moviesService.getAllMovies();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movies> getMoviesById(@PathVariable Long id) {
        // TODO: Implement function
        Optional<Movies> movie = moviesService.getMoviesById(id);
        if (movie.isEmpty()) {
            throw new ResourceNotFoundException("Movie not found with id: " + id);
        }
        return new ResponseEntity<>(movie.get(), HttpStatus.OK);
    }

    @PostMapping
    public Movies addMovies(@RequestBody MoviesDto moviesDto) {
        // TODO: Implement function
        return moviesService.addMovies(moviesDto);
    }

    @PostMapping("/addPredefinedMovies")
    public ResponseEntity<Void> addPredefinedMovies() {
        // TODO: Implement function
        moviesService.addPredefinedMovies();
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movies> updateMovies(@PathVariable Long id, @RequestBody MoviesDto moviesDto) {
        // TODO: Implement function
        Movies updatedMovie = moviesService.updateMovies(id, moviesDto);
        return new ResponseEntity<>(updatedMovie, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovies(@PathVariable Long id) {
        // TODO: Implement function
        moviesService.deleteMovies(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
