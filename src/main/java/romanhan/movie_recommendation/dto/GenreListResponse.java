package romanhan.movie_recommendation.dto;

import java.util.List;

import lombok.Data;

@Data
public class GenreListResponse {
    private List<MovieDto.Genre> genres;
}
