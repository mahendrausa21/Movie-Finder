package springboot.mvc.MovieFinder.Model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "movie_show")

public class Showtime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "show_id")
    private Long showId;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    @Column(name = "show_date", nullable = false)
    private LocalDate showDate;

    @Column(name = "show_time", nullable = false)
    private LocalTime showTime;

    @ManyToOne
    @JoinColumn(name = "theater_id", nullable = false)
    private Theatre theatre;
    
    public Showtime() {
		// TODO Auto-generated constructor stub
	}

	public Showtime(Long showId, String name, Movie movie, LocalDate showDate, LocalTime showTime, Theatre theatre) {
		super();
		this.showId = showId;
		this.name = name;
		this.movie = movie;
		this.showDate = showDate;
		this.showTime = showTime;
		this.theatre = theatre;
	}

	public Long getShowId() {
		return showId;
	}

	public String getName() {
		return name;
	}

	public Movie getMovie() {
		return movie;
	}

	public LocalDate getShowDate() {
		return showDate;
	}

	public LocalTime getShowTime() {
		return showTime;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setShowId(Long showId) {
		this.showId = showId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}

	public void setShowTime(LocalTime showTime) {
		this.showTime = showTime;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	@Override
	public String toString() {
		return "Showtime [showId=" + showId + ", name=" + name + ", movie=" + movie + ", showDate=" + showDate
				+ ", showTime=" + showTime + ", theatre=" + theatre + "]";
	}
    
    
    

    
}
