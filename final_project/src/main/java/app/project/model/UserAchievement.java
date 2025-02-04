package main.java.app.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.toString;

@Getter @Setter @toString
public class UserAchievement {
    private Long achievementId;
    private Long userId;
    private Timestamp unlockedAt;
    private String achievementImg;
}