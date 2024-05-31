package se.dsve.movies.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginUserDto {
    private String email;
    private String password;

    public String getUsername() {
        return email;
    }

}
