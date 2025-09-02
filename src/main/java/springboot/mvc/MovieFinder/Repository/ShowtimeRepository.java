package springboot.mvc.MovieFinder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.mvc.MovieFinder.Model.Showtime;
import org.springframework.data.jpa.repository.Query;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface ShowtimeRepository extends JpaRepository<Showtime, Long> {

    // Query 4: Frequency of movie shows by name
    @Query("SELECT s.movie.name, COUNT(s) FROM Showtime s GROUP BY s.movie.name")
    List<Object[]> getShowFrequencyByMovie();

    // Optional: find shows by movie or date if needed

 // ✅ ADD THIS
    List<Showtime> findByMovie_Id(Long movieId);

    List<Showtime> findByShowDate(LocalDate showDate);
   
}
