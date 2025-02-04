package main.java.app.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.toString;

@Getter @Setter @toString
public class Comments {
    private Long commentId;
    private Long postId;
    private Long userId;
    private String content; // CLOB 타입은 String으로 처리
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
