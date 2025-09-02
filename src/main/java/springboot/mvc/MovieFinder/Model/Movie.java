package springboot.mvc.MovieFinder.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "movies")   

public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")   // primary key column
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "language", nullable = false, length = 50)
    private String language;

    @Column(name = "duration")
    private int duration;

    @Column(name = "released_year")
    private int releasedYear;
    
    
    public Movie() {
		// TODO Auto-generated constructor stub
	}


	public Movie(Long id, String name, String language, int duration, int releasedYear) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.duration = duration;
		this.releasedYear = releasedYear;
	}


	
	
	public Long getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getLanguage() {
		return language;
	}


	public int getDuration() {
		return duration;
	}


	public int getReleasedYear() {
		return releasedYear;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public void setReleasedYear(int releasedYear) {
		this.releasedYear = releasedYear;
	}


	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", language=" + language + ", duration=" + duration
				+ ", releasedYear=" + releasedYear + "]";
	}
    
    
    
	

}
