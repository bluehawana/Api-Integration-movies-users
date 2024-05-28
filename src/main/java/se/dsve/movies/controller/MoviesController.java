package se.dsve.movies.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.dsve.movies.dtos.MoviesDto;
import se.dsve.movies.exceptions.ResourceNotFoundException;
import se.dsve.movies.model.Movies;
import se.dsve.movies.services.MoviesService;

import java.util.List;

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
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movies> getMoviesById(@PathVariable Long id) {
        // TODO: Implement function
        return null;
    }

    @PostMapping
    public Movies addMovies(@RequestBody MoviesDto moviesDto) {
        // TODO: Implement function
        return null;
    }

    @PostMapping("/addPredefinedMovies")
    public ResponseEntity<Void> addPredefinedMovies() {
        // TODO: Implement function
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movies> updateMovies(@PathVariable Long id, @RequestBody MoviesDto moviesDto) {
        // TODO: Implement function
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovies(@PathVariable Long id) {
        // TODO: Implement function
        return null;
    }
}
