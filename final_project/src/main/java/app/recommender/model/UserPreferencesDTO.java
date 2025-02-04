package app.recommender.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class UserPreferencesDTO {
    private List<String> genres;
    private List<String> tags;
}
