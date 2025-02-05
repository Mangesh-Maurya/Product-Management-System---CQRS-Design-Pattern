📌 Product Management System - CQRS Design Pattern

This project implements a Product Management System using the CQRS (Command Query Responsibility Segregation) design pattern with Spring Boot and MySQL. It separates write (command) operations from read (query) operations, ensuring better performance and scalability.

🚀 Features

Command Side (Write Operations): Handles product creation, updates, and deletions.

Query Side (Read Operations): Optimized retrieval of product details using a dedicated read model.

Event-Driven Synchronization: Uses Spring EventListeners to update the read model in real-time.

Database Integration: Uses MySQL, with separate tables for command and query models.

RESTful API Implementation: Supports CRUD operations, tested with Postman.

🛠 Tech Stack

Backend: Spring Boot, Spring Data JPA

Database: MySQL

Architecture: CQRS, Event-Driven

Tools: Postman, Git, Maven

📂 Project Structure

📂 com.cqrs
 ┣ 📂 command (Write Side)
 ┃ ┣ 📜 ProductCommandController.java
 ┃ ┣ 📜 ProductService.java
 ┃ ┣ 📜 ProductRepository.java
 ┃ ┣ 📜 ProductEntity.java
 ┃ ┗ 📜 ProductCommand.java
 ┣ 📂 query (Read Side)
 ┃ ┣ 📜 ProductQueryController.java
 ┃ ┣ 📜 ProductQueryService.java
 ┃ ┣ 📜 ProductReadRepository.java
 ┃ ┣ 📜 ProductReadModel.java
 ┃ ┗ 📜 ProductEventListener.java ✅ (Place Here)
 ┣ 📜 ProductManagementSystemApplication.java

📝 API Endpoints

📌 Command Side (Write Operations)


POST

/products

Create a new product

PUT

/products/{id}

Update a product by ID

DELETE

/products/{id}

Delete a product by ID

📌 Query Side (Read Operations)


GET

/products

Get all products

GET

/products/{id}

Get product by ID

🔧 Setup & Installation

Clone the repository

git clone https://github.com/yourusername/product-management-cqrs.git
cd product-management-cqrs

Configure MySQL Database

Update application.properties with your MySQL credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/cqrs_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update


Build & Run the Application

mvn clean install
mvn spring-boot:run

Test APIs in Postman

Use Postman or any API client to send requests to http://localhost:8086/products

🤝 Contributing

Contributions, issues, and feature requests are welcome!

📜 License

This project is open-source and available under the MIT License.

🔗 GitHub Repository: https://github.com/Mangesh-Maurya/Product-Management-System---CQRS-Design-Pattern

![Screenshot (129)](https://github.com/user-attachments/assets/7f7167a8-43dc-4798-86af-331ea2367455)
![Screenshot (130)](https://github.com/user-attachments/assets/6154f738-f2ba-4097-b131-18e063e7d674)
![Screenshot (124)](https://github.com/user-attachments/assets/87ff2f52-343b-4d7c-922f-503df3777f0b)
![Screenshot (125)](https://github.com/user-attachments/assets/3a22acdf-2e41-44a6-b497-4233de30ace3)
![Screenshot (126)](https://github.com/user-attachments/assets/537f2b7a-12de-4d70-b478-d5b452fad058)
![Screenshot (127)](https://github.com/user-attachments/assets/edaee860-2f6f-466b-ba6a-c3758b5bc07a)
![Screenshot (128)](https://github.com/user-attachments/assets/ae66074b-35c4-485b-8be4-f28252698ea0)

