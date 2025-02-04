package main.java.app.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter @Setter @ToString
public class GameReview {
    private Long reviewId;
    private Long gameId;
    private Long userId;
    private Timestamp createdAt;
    private String content; // CLOB 타입은 String으로 처리
    private Timestamp updatedAt;
    private Double rating; // 3,2 숫자는 Double로 처리
} 