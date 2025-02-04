package main.java.app.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.toString;

@Getter @Setter @toString
public class GameDescriptionImages {
    private Long imageId;
    private Long gameDescriptionId;
    private String imageUrl;
}
