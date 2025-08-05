# 🌟 Employee Management System

A full-featured REST API built using **Spring Boot**, **PostgreSQL**, and **Hibernate (JPA)** to manage employee data. Designed with clean architecture, custom exception handling, and DTO pattern using ModelMapper.

---

## 🚀 Features

- ✅ Create, Read, Update, Delete (CRUD) Employees
- 🛡️ Global Exception Handling (`@RestControllerAdvice`)
- 🧠 DTO Mapping using ModelMapper
- 🗃️ PostgreSQL integration with Hibernate
- 📐 Clean layered architecture (Controller, Service, Repository)
- 🔍 Log SQL queries for debugging

---

## 📦 Tech Stack

| Technology       | Description                          |
|------------------|--------------------------------------|
| Java 21          | Programming language                 |
| Spring Boot      | Backend framework                    |
| Spring Data JPA  | ORM and database abstraction         |
| PostgreSQL       | Relational database                  |
| ModelMapper      | Object mapping                       |
| Maven            | Build automation tool                |
| Lombok           | Boilerplate code reduction           |

---

## 📁 Project Structure

```
com.Callofcoders.EmployeeManage
├── controller            # REST Controllers
├── service               # Service Interface
│   └── impl              # Service Implementation
├── repository            # Spring Data Repositories
├── dto                   # Data Transfer Objects
├── entity                # JPA Entities
└── exceptions            # Custom Exception Classes
```

---

## ⚙️ Setup & Run

### Prerequisites
- Java 21
- Maven
- PostgreSQL

### Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/Ashh26/EmployeeManagement.git
   cd employee-management
   ```

2. **Configure Database Credentials**
   Set your credentials in `application.properties` or use environment variables.

3. **Run the App**
   ```bash
   mvn spring-boot:run
   ```

---

## 📬 API Endpoints

| Method | Endpoint            | Description               |
|--------|---------------------|---------------------------|
| GET    | `/employees`        | Get all employees         |
| GET    | `/employees/{id}`   | Get employee by ID        |
| POST   | `/employees`        | Add new employee          |
| PUT    | `/employees/{id}`   | Update existing employee  |
| DELETE | `/employees/{id}`   | Delete employee           |

---

## 📄 License

This project is open-source and available under the [MIT License](LICENSE).

---

## 🙌 Acknowledgments

Inspired by real-world backend service patterns and best practices in Spring Boot.

---
📘 [Download Employee Guide (PDF)](docs/Rest api development Employee management..pdf)



> Made with ❤️ by [Yasif khan]
