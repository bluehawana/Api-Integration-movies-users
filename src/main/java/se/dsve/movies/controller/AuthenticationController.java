package se.dsve.movies.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.dsve.movies.dtos.LoginUserDto;
import se.dsve.movies.dtos.RegisterUserDto;
import se.dsve.movies.model.LoginResponse;
import se.dsve.movies.model.User;
import se.dsve.movies.services.AuthenticationService;
import se.dsve.movies.services.JwtService;

@RequestMapping("/auth")
@RestController
public class AuthenticationController {

    private final JwtService jwtService;
    private final AuthenticationService authenticationService;

    public AuthenticationController(JwtService jwtService, AuthenticationService authenticationService) {
        this.jwtService = jwtService;
        this.authenticationService = authenticationService;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> register(@RequestBody RegisterUserDto registerUserDto) {
        // TODO: Implement function
        User user = authenticationService.signup(registerUserDto);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> authenticate(@RequestBody LoginUserDto loginUserDto) {
        // TODO: Implement function
        User user = authenticationService.authenticate(loginUserDto);
        return new ResponseEntity<>(new LoginResponse(jwtService.generateToken(user), jwtService.getExpirationTime()), HttpStatus.OK);
    }
}
