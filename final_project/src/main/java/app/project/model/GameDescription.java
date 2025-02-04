package main.java.app.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.toString;

@Getter @Setter @toString
public class GameDescription {
    private Long gameDescriptionId;
    private Long gameId;
    private String description;
}