package se.dsve.movies.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MoviesDto {
    private String title;
    private String director;
    private double rating;
    private int releaseYear;
    private String genre;
    private Long id;
}
