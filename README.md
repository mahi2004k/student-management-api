# Student Management REST API

A professional RESTful API built using **Spring Boot**, **Spring Data JPA**, and **MySQL** to perform CRUD operations on student data. This project demonstrates backend development practices including layered architecture, REST API design, database integration, and API testing using Postman.

---

## 🚀 Features

- Create a new student
- Retrieve all students
- Retrieve student by ID
- Update existing student details
- Delete student records
- RESTful API design
- MySQL database integration
- Spring Data JPA for database operations
- Proper HTTP status codes
- Postman API testing support

---

## 🛠️ Technologies Used

| Technology | Description |
|------------|-------------|
| Java 21 | Programming Language |
| Spring Boot | Backend Framework |
| Spring Data JPA | Database Access Layer |
| Hibernate | ORM Framework |
| MySQL | Relational Database |
| Maven | Dependency Management |
| Postman | API Testing |
| Git & GitHub | Version Control |

---

# 📂 Project Structure

```
student-management-api
│
├── src/main/java/com/mahesh/studentapi
│
├── controller
│      └── StudentController.java
│
├── entity
│      └── Student.java
│
├── repository
│      └── StudentRepository.java
│
├── service
│      ├── StudentService.java
│      └── StudentServiceImpl.java
│
├── resources
│      └── application.properties
│
├── pom.xml
└── README.md
```

---

# ⚙️ Prerequisites

Before running this project, make sure you have:

- Java JDK 21 installed
- Maven installed
- MySQL installed
- Postman installed

Check versions:

```bash
java -version
```

```bash
mvn -version
```

---

# 🗄️ Database Configuration

Create a MySQL database:

```sql
CREATE DATABASE student_db;
```

Update the database configuration in:

```
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8080
```

---

# ▶️ How to Run the Application

### 1. Clone Repository

```bash
git clone https://github.com/your-username/student-management-api.git
```

---

### 2. Navigate to Project Directory

```bash
cd student-management-api
```

---

### 3. Build Project

```bash
mvn clean install
```

---

### 4. Run Application

Using Maven:

```bash
mvn spring-boot:run
```

OR

Run the main class:

```
StudentApiApplication.java
```

---

The application will start at:

```
http://localhost:8080
```

---

# 🔗 REST API Endpoints

Base URL:

```
http://localhost:8080/api/students
```

---

## 1. Create Student

### Request

```
POST /api/students
```

### Request Body

```json
{
    "name": "Mahesh Konnur",
    "email": "mahesh@gmail.com",
    "course": "Java Full Stack"
}
```

### Response

```json
{
    "id": 1,
    "name": "Mahesh Konnur",
    "email": "mahesh@gmail.com",
    "course": "Java Full Stack"
}
```

Status Code:

```
201 CREATED
```

---

# 2. Get All Students

### Request

```
GET /api/students
```

### Response

```json
[
    {
        "id":1,
        "name":"Mahesh Konnur",
        "email":"mahesh@gmail.com",
        "course":"Java Full Stack"
    }
]
```

Status Code:

```
200 OK
```

---

# 3. Get Student By ID

### Request

```
GET /api/students/{id}
```

Example:

```
GET /api/students/1
```

Status Code:

```
200 OK
```

---

# 4. Update Student

### Request

```
PUT /api/students/{id}
```

Example:

```
PUT /api/students/1
```

Request Body:

```json
{
    "name":"Mahesh",
    "email":"mahesh@gmail.com",
    "course":"Spring Boot"
}
```

Status Code:

```
200 OK
```

---

# 5. Delete Student

### Request

```
DELETE /api/students/{id}
```

Example:

```
DELETE /api/students/1
```

Status Code:

```
204 NO CONTENT
```

---

# 🧪 API Testing

All APIs are tested using **Postman**.

Postman Collection:

```
postman/
 └── StudentAPI.postman_collection.json
```

Tested Operations:

✅ Create Student  
✅ Get All Students  
✅ Get Student By ID  
✅ Update Student  
✅ Delete Student  

---

# 📸 Screenshots

API testing screenshots:

```
screenshots/

├── create-student.png
├── get-all-students.png
├── get-student-by-id.png
├── update-student.png
└── delete-student.png
```

---

# 🏗️ Architecture

The application follows a layered architecture:

```
Controller Layer
        |
        |
Service Layer
        |
        |
Repository Layer
        |
        |
Database
```

### Controller Layer
Handles HTTP requests and responses.

### Service Layer
Contains business logic.

### Repository Layer
Handles database communication using JPA.

### Entity Layer
Represents database tables.

---

# 📌 HTTP Status Codes Used

| Status Code | Meaning |
|-------------|---------|
| 200 OK | Request successful |
| 201 CREATED | Resource created successfully |
| 204 NO CONTENT | Resource deleted successfully |
| 404 NOT FOUND | Resource not found |

---

# 🔮 Future Enhancements

- Add Spring Security with JWT Authentication
- Add DTO layer
- Add request validation
- Add global exception handling
- Add Swagger/OpenAPI documentation
- Deploy using Docker
- Deploy backend on cloud platforms

---

# 👨‍💻 Author

**Mahesh Konnur**

GitHub:
```
https://github.com/mahi2004k
```

LinkedIn:
```
http://linkedin.com/in/mahesh-konnur
```

---

# 📄 License

This project is created for learning purposes and backend development practice.
