package springboot.mvc.MovieFinder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.mvc.MovieFinder.Model.Theatre;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Long> {

    // Query 3: Theatres with capacity > 200 and address containing "Theatre"
    List<Theatre> findByCapacityGreaterThanAndAddressContaining(int capacity, String keyword);

    // Query 5: Average capacity
    @Query("SELECT AVG(t.capacity) FROM Theatre t")
    Double getAverageCapacity();

    // Query 5: Theatres with capacity above average
    List<Theatre> findByCapacityGreaterThan(double capacity);
    
    List<Theatre> findByAddressContainingIgnoreCase(String location);
}
