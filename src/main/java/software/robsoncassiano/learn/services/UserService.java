package software.robsoncassiano.learn.services;

import org.springframework.stereotype.Service;
import software.robsoncassiano.learn.models.dto.UserDTO;
import software.robsoncassiano.learn.repositories.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> findAll() {
        return userRepository.findAll().stream()
                .map(UserDTO::new)
                .collect(Collectors.toList());
    }
}
