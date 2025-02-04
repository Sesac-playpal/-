package main.java.app.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.toString;

@Getter @Setter @toString
public class Communities {
    private Long communityId;
    private String name;
    private Long gameId;
    private String description;
}
