package se.dsve.movies.services;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import se.dsve.movies.dtos.LoginUserDto;
import se.dsve.movies.dtos.RegisterUserDto;
import se.dsve.movies.model.LoginResponse;
import se.dsve.movies.model.User;
import se.dsve.movies.repository.UserRepository;
import java.util.NoSuchElementException;


@Service
public class AuthenticationService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    public AuthenticationService(
            UserRepository userRepository,
            AuthenticationManager authenticationManager,
            PasswordEncoder passwordEncoder, JwtService jwtService
    ) {
        this.userRepository = userRepository;
        this.authenticationManager = authenticationManager;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }

    public User signup(RegisterUserDto input) {
        // TODO: Implement function
        User user = User.builder()
                .email(input.getEmail())
                .password(passwordEncoder.encode(input.getPassword()))
                .fullName(input.getFullName())
                .build();
        return userRepository.save(user);
    }
    public User authenticate(LoginUserDto input) {
        // TODO: Implement function
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        input.getEmail(),
                        input.getPassword()
                )
        );
        User user = userRepository.findByEmail(input.getEmail())
                .orElseThrow(() -> new NoSuchElementException("User not found"));

        String token = jwtService.generateToken(user);
        long expiresIn = jwtService.getExpirationTime();

        return user;
    }
}
