package main.java.app.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.toString;

@Getter @Setter @toString
public class Developers {
    private Long developerId;
    private Long userId;
    private String companyName;
    private String description;
}
