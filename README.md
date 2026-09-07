# Job Application Tracker API

A backend REST API built with Spring Boot to manage and track job applications.

This project is being developed as a portfolio-grade backend project to learn and demonstrate practical backend engineering concepts including REST APIs, layered architecture, PostgreSQL, JPA/Hibernate, validation, exception handling, testing, security, and deployment.

---

## 🚧 Project Status

Currently under development.

### Completed

- [x] Spring Boot project setup
- [x] Maven project setup
- [x] PostgreSQL database integration
- [x] JPA/Hibernate configuration
- [x] Application entity
- [x] Repository layer
- [x] Service layer
- [x] Controller layer
- [x] Create job application
- [x] Get all job applications
- [x] Get application by ID
- [x] PostgreSQL persistence
- [x] REST Client API testing

### Upcoming

- [ ] Update job application
- [ ] Delete job application
- [ ] Input validation
- [ ] Proper exception handling
- [ ] DTOs
- [ ] Pagination
- [ ] Filtering and sorting
- [ ] Search
- [ ] User authentication
- [ ] JWT-based authorization
- [ ] Unit and integration testing
- [ ] Docker
- [ ] React frontend
- [ ] Deployment

---

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

## 🏗️ Architecture

The backend follows a layered architecture:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
JPA / Hibernate
    ↓
PostgreSQL