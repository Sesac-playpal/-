package main.java.app.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RecommendSpecifications {
    private Long gameId;
    private String os;
    private String processor;
    private String memory;
    private String graphics;
    private String storage;
} 