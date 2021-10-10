package software.robsoncassiano.learn.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import software.robsoncassiano.learn.models.dto.UserDTO;
import software.robsoncassiano.learn.services.UserService;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/users")
    public ResponseEntity<List<UserDTO>> findAll() {
        List<UserDTO> userDTOList = userService.findAll();
        return ResponseEntity.ok().body(userDTOList);
    }
}
