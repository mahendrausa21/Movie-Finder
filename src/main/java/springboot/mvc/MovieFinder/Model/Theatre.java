package springboot.mvc.MovieFinder.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "theatres")

public class Theatre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "theater_id")
    private Long theaterId;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "address", nullable = false, length = 200)
    private String address;

    @Column(name = "contact_no", nullable = false, length = 15)
    private String contactNo;

    @Column(name = "capacity")
    private int capacity;
    
    public Theatre() {
		// TODO Auto-generated constructor stub
	}

	public Theatre(Long theaterId, String name, String address, String contactNo, int capacity) {
		super();
		this.theaterId = theaterId;
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;
		this.capacity = capacity;
	}

	
	
	public Long getTheaterId() {
		return theaterId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getContactNo() {
		return contactNo;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setTheaterId(Long theaterId) {
		this.theaterId = theaterId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Theatre [theaterId=" + theaterId + ", name=" + name + ", address=" + address + ", contactNo="
				+ contactNo + ", capacity=" + capacity + "]";
	}
    
    
   
}
