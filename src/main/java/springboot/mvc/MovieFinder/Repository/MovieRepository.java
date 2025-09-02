package springboot.mvc.MovieFinder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.mvc.MovieFinder.Model.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    // Query 1: Movies released between 1971 and 1994
    List<Movie> findByReleasedYearBetween(int startYear, int endYear);

    // Query 2: Latest movie released near user location (via city in Theatre)
    @Query("SELECT DISTINCT s.movie FROM Showtime s WHERE s.theatre.address LIKE %:location% ORDER BY s.movie.releasedYear DESC")
    List<Movie> findLatestMoviesByLocation(@Param("location") String location);

    List<Movie> findByNameContainingIgnoreCase(String name);
}
