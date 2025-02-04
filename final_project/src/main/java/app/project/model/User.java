package main.java.app.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.toString;

@Gatter @Setter @toString
public class User {
    private Long userId;
    private String username;
    private String email;
    private String password;
    private String profileImage;
    private String userRole;
    private Timestamp registeredDate;    
}
