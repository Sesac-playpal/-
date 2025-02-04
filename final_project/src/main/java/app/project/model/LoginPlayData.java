package main.java.app.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.toString;

@Getter @Setter @toString
public class LoginPlayData {
    private Long loginPlayDataId;
    private Long userId;
    private Long gameId;
    private Integer playTime; 
    private Timestamp lastPlayed;
}
