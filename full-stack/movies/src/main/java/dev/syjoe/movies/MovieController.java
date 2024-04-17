package dev.syjoe.movies;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @GetMapping
    public String allMovies() {
        return "All movies";
    }
}
