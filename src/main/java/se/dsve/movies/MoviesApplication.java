package se.dsve.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import se.dsve.movies.services.MoviesService;

@SpringBootApplication
public class MoviesApplication {

 public static void main(String[] args) {
  ApplicationContext context = SpringApplication.run(MoviesApplication.class, args);
  MoviesService moviesService = context.getBean(MoviesService.class);
  moviesService.addPredefinedMovies();
 }

}