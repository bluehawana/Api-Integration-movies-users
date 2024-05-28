package se.dsve.movies.services;

import org.springframework.stereotype.Service;
import se.dsve.movies.model.User;
import se.dsve.movies.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> allUsers() {
        // TODO: Implement function
        return null;
    }
}
