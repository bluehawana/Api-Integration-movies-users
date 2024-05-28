package se.dsve.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.dsve.movies.model.Movies;

public interface MoviesRepository extends JpaRepository<Movies, Long>{
}
