package springboot.mvc.MovieFinder.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.mvc.MovieFinder.Model.Movie;
import springboot.mvc.MovieFinder.Model.Showtime;
import springboot.mvc.MovieFinder.Model.Theatre;
import springboot.mvc.MovieFinder.Repository.MovieRepository;
import springboot.mvc.MovieFinder.Repository.ShowtimeRepository;
import springboot.mvc.MovieFinder.Repository.TheatreRepository;

@Service
public class MovieFinderService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private TheatreRepository theatreRepository;

    @Autowired
    private ShowtimeRepository showtimeRepository;

    // Query 1: Movies released between years
    public List<Movie> getMoviesBetweenYears(int startYear, int endYear) {
        return movieRepository.findByReleasedYearBetween(startYear, endYear);
    }

    // Query 2: Latest movies near user location
    public List<Movie> getLatestMoviesByLocation(String location) {
        return movieRepository.findLatestMoviesByLocation(location);
    }

    // Query 3: Theatres with capacity > 200 and address contains "Theatre"
    public List<Theatre> getTheatresWithCapacityAbove200AndAddressContainingTheatre() {
        return theatreRepository.findByCapacityGreaterThanAndAddressContaining(200, "Theatre");
    }

    // Query 4: Frequency of movie shows by name
    public Map<String, Long> getMovieShowFrequency() {
        List<Object[]> list = showtimeRepository.getShowFrequencyByMovie();
        Map<String, Long> freqMap = new HashMap<>();
        for (Object[] obj : list) {
            freqMap.put((String) obj[0], (Long) obj[1]);
        }
        return freqMap;
    }

    // Query 5: Theatres with capacity greater than average
    public List<Theatre> getTheatresAboveAverageCapacity() {
        Double avgCapacity = theatreRepository.getAverageCapacity();
        return theatreRepository.findByCapacityGreaterThan(avgCapacity);
    }
    
 // In MovieFinderService.java
    public List<Showtime> getAllShows() {
        return showtimeRepository.findAll();
    }

    
    
   


}
