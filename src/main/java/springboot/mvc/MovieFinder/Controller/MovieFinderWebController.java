package springboot.mvc.MovieFinder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springboot.mvc.MovieFinder.Model.*;
import springboot.mvc.MovieFinder.Service.*;

import java.util.List;
import java.util.Map;

@Controller
public class MovieFinderWebController {

    private final MovieFinderService movieService;

    public MovieFinderWebController(MovieFinderService movieService) {
        this.movieService = movieService;
    }

    // 🏠 Index page - just show welcome
    @GetMapping("/")
    public String index(Model model) {
        List<Showtime> shows = movieService.getAllShows();
        model.addAttribute("shows", shows);
        return "index"; // index.html
    }


    // 1️⃣ Movies released between 1971 and 1994
    @GetMapping("/movies/1971-1994")
    public String moviesBetweenYears(Model model) {
        List<Movie> movies = movieService.getMoviesBetweenYears(1971, 1994);
        model.addAttribute("movies", movies);
        return "movies"; // movies.html
    }

    // 2️⃣ Latest movie released near location (city/address)
    @GetMapping("/movies/latest")
    public String latestMovieByLocation(@RequestParam String location, Model model) {
        List<Movie> movies = movieService.getLatestMoviesByLocation(location);
        model.addAttribute("movies", movies);
        model.addAttribute("location", location);
        return "movies-latest"; // movies-latest.html
    }

    // 3️⃣ Theatres with capacity > 200 and address containing "Theatre"
    @GetMapping("/theatres/filter")
    public String theatresCapacityAndAddress(Model model) {
        List<Theatre> theatres = movieService.getTheatresWithCapacityAbove200AndAddressContainingTheatre();
        model.addAttribute("theatres", theatres);
        return "theatres"; // theatres.html
    }

    // 4️⃣ Frequency of shows by movie name
    @GetMapping("/shows/frequency")
    public String showFrequency(Model model) {
        Map<String, Long> freq = movieService.getMovieShowFrequency();
        model.addAttribute("frequency", freq);
        return "frequency"; // frequency.html
    }

    // 5️⃣ Theatres with capacity above average
    @GetMapping("/theatres/above-average")
    public String theatresAboveAverage(Model model) {
        List<Theatre> theatres = movieService.getTheatresAboveAverageCapacity();
        model.addAttribute("theatres", theatres);
        return "theatres-above"; // theatres-above.html
    }
  
    
}
