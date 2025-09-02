🎬 Movie Finder

A Spring Boot + Thymeleaf + MySQL web application that helps users find movies, theaters, and showtimes.
This project demonstrates Spring Boot MVC architecture, Spring Data JPA, and Thymeleaf templating engine.

🚀 Features

🎥 Manage Movies, Theaters, and Showtimes

📅 Display movies with show date & time

🗄️ Integrated with MySQL database using Spring Data JPA

🌐 Web interface built with Thymeleaf + Bootstrap

🏗️ Follows layered architecture: Entity → Repository → Service → Controller → View

🛠️ Tech Stack

Backend: Java, Spring Boot, Spring Data JPA

Frontend: Thymeleaf, Bootstrap, HTML, CSS

Database: MySQL

Build Tool: Maven

📂 Project Structure
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

Clone the repo

git clone https://github.com/mahendrausa21/Movie-Finder.git
cd Movie-Finder


Configure MySQL
Update src/main/resources/application.properties with your DB credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/moviedb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update


Run the application

mvn spring-boot:run


Access in browser
Open 👉 http://localhost:8080

📸 Screenshots

(You can add screenshots later once UI is ready)

📖 Workflow Explanation

Created Entities (Movie, Theatre, Showtime) mapped with JPA

Defined Repositories (JpaRepository) for DB operations

Built a Service layer for business logic

Implemented WebController to handle requests & responses

Designed UI using Thymeleaf templates (index.html) with Bootstrap

Integrated MySQL to fetch & display movie + theater + showtime details

👨‍💻 Author

Mahendra Usirikayala
📌 2027 Passout | Aspiring SDE | Java & Spring Boot Enthusiast
mahendrausirikayala@gamil.com
