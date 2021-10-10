package software.robsoncassiano.learn.models.dto;

import software.robsoncassiano.learn.models.entities.User;

public class UserDTO {
    private String id;
    private String name;
    private String email;

    public UserDTO() {
    }

    public UserDTO(User entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
