# 🎬 Movie Finder

Movie Finder is a **Spring Boot + Thymeleaf web application** that allows users to view movies, theaters, and showtimes stored in a MySQL database. It follows a clean layered architecture using **Spring Data JPA**, **Service layer**, and **MVC Controller**.

---

## 🚀 Features
- View movies, theaters, and showtimes  
- Uses **Spring Boot + Thymeleaf** for UI rendering  
- **Spring Data JPA** for database interaction  
- **MVC architecture** with Controller, Service, Repository layers  
- Bootstrap-based **responsive UI**  

---

## 🛠️ Tech Stack
- **Backend:** Java, Spring Boot, Spring MVC, Spring Data JPA  
- **Frontend:** Thymeleaf, Bootstrap, HTML, CSS  
- **Database:** MySQL  
- **Build Tool:** Maven  

---

## 📂 Project Structure
``
MovieFinder_Project/
│── src/main/java/springboot/mvc/MovieFinder
│   ├── Controller/         # Web controllers
│   ├── Model/              # Entities (Movie, Theatre, Showtime)
│   ├── Repository/         # JPA Repositories
│   ├── Service/            # Business logic
│   └── MovieFinderApplication.java
│
│── src/main/resources/
│   ├── application.properties  # DB Configuration
│   └── templates/index.html    # Thymeleaf template
│
│── pom.xml                # Maven dependencies
│── README.md              # Project documentation
⚙️ Setup & Run
Clone the repository

bash
Copy code
git clone https://github.com/mahendrausa21/Movie-Finder.git
cd Movie-Finder
Configure Database
Update src/main/resources/application.properties with your MySQL credentials:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/movie_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
Run the application

bash
Copy code
mvn spring-boot:run
Access in browser
Open 👉 http://localhost:8080


👨‍💻 Author
Mahendra Usirikayala
