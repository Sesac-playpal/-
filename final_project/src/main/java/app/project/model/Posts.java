package main.java.app.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.toString;

@Getter @Setter @toString
public class Posts {
    private Long postId;
    private Long communityId;
    private Long userId;
    private String title;
    private String content; 
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Long recommendCounts;
}
