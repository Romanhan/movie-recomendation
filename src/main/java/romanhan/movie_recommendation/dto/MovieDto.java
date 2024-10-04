package romanhan.movie_recommendation.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MovieDto {
    private Long id;
    private String title;
    @JsonProperty("poster_path")
    private String posterPath;
    private String overview;
    @JsonProperty("release_date")
    private String releaseDate;
    private List<Genre> genres;

    @Data
    public static class Genre {
        private Long id;
        private String name;
    }
}
