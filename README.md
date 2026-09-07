# Job Application Tracker API

A RESTful backend application built with Spring Boot to manage and track job applications.

The project is being developed incrementally to understand how a production-style Spring Boot backend is designed, rather than building the entire application at once.

## Tech Stack

- Java 21
- Spring Boot 4.1.1
- Spring Web
- Spring Data JPA
- Hibernate
- PostgreSQL 18
- Maven
- VS Code

## Project Architecture

The application follows a layered architecture:

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





## explanations:-
The service contains the business logic. 
The controller should only receive HTTP requests and return HTTP responses

Controller layer-->This is the layer where the application starts interacting with HTTP requests
Repository--> Responsible for communicating with the database

## To check:

Dependency Injection
Beans
Hibernate