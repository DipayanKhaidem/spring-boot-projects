# Job Application Tracker API

A backend REST API built with Spring Boot to manage and track job applications.

This project is being developed as a portfolio-grade backend project to learn and demonstrate practical backend engineering concepts including REST APIs, layered architecture, PostgreSQL, JPA/Hibernate, validation, exception handling, testing, security, and deployment.

---

## Project Structure

```text
jobtracker/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── dipayan/
│       │           └── jobtracker/
│       │               ├── controller/
│       │               │   └── ApplicationController.java
│       │               │
│       │               ├── service/
│       │               │   └── ApplicationService.java
│       │               │
│       │               ├── repository/
│       │               │   └── ApplicationRepository.java
│       │               │
│       │               ├── entity/
│       │               │   └── Application.java
│       │               │
│       │               ├── exception/
│       │               │   ├── ApplicationNotFoundException.java
│       │               │   └── GlobalExceptionHandler.java
│       │               │
│       │               └── JobtrackerApplication.java
│       │
│       └── resources/
│           └── application.properties
│
├── requests.http
├── pom.xml
└── README.md



## 🎯 Project Goal

The application allows users to manually record and manage the jobs they have applied for.

Example information stored for each application:

- Company
- Position
- Location
- Application status
- Application date
- Job URL
- Notes

The goal is to eventually turn this into a complete full-stack application with a React frontend and a deployed Spring Boot backend.

---

## 🛠️ Tech Stack

### Backend

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven
- PostgreSQL

### Development & Testing

- Visual Studio Code
- REST Client
- PostgreSQL / pgAdmin
- Git & GitHub

### Planned

- Spring Security
- JWT
- JUnit
- Mockito
- Docker
- React
- Vercel
- Cloud deployment

---


### Architecture

Your architecture section can now say:

```markdown
## Architecture

The backend follows a layered architecture:

Controller
↓
Service
↓
Repository
↓
JPA/Hibernate
↓
PostgreSQL

### Responsibilities

**Controller**
- Handles HTTP requests and responses
- Maps API endpoints
- Passes requests to the service layer

**Service**
- Contains application/business logic
- Coordinates operations between controllers and repositories
- Handles application lookup and update/delete logic

**Repository**
- Provides database access through Spring Data JPA
- Uses `JpaRepository` for CRUD operations

**Exception Layer**
- Contains custom application exceptions
- Provides centralized exception handling through `@RestControllerAdvice`

## API Endpoints

| Method | Endpoint | Description | Status |
|--------|----------|-------------|--------|
| POST | `/api/applications` | Create a job application | ✅ |
| GET | `/api/applications` | Get all applications | ✅ |
| GET | `/api/applications/{id}` | Get application by ID | ✅ |
| PUT | `/api/applications/{id}` | Update an application | ✅ |
| DELETE | `/api/applications/{id}` | Delete an application | ✅ |

## Exception Handling

The API uses a custom exception and global exception handler for handling missing applications.

### Custom Exception

`ApplicationNotFoundException` is thrown when an application with the requested ID does not exist.

### Global Exception Handler

`GlobalExceptionHandler` uses `@RestControllerAdvice` to handle application-specific exceptions across the API.

For example:

```http
GET /api/applications/999