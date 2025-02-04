package main.java.app.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.toString;

@Getter @Setter @toString
public class Games {
    private Long gameId;
    private Long developerId;
    private String title;
    private String description;
    private String genre;
    private Double price;
    private Double rating;
    private Date registeredDate;
    private Date releaseDate;
    private Double sale;
    private Boolean playable; // 0 또는 1을 Boolean으로 변환
    private String platform;
}
