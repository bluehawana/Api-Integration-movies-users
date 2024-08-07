package se.dsve.movies.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegisterUserDto {
    private String email;
    private String password;
    private String fullName;
}
