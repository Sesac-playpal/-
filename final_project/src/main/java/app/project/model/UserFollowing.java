package main.java.app.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.toString;

@Getter @Setter @toString
public class UserFollowing {
    private Long followerId;
    private Long followingId;
}
