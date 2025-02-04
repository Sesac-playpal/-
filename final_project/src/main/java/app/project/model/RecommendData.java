package main.java.app.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.toString;

@Getter @Setter @toString
public class RecommendData {
    private Long recommendDataId;
    private Long userId;
    private Long gameId;
    private Date createdAt;
}
