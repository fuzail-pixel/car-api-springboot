# 🚗 Car API - Spring Boot 

This is a simple REST API for managing cars, built using Java and Spring Boot. It supports basic CRUD operations and search functionality, and uses H2 as an in-memory database. Swagger UI and a Postman collection are included for easy testing.

---

## ✅ Features

- Add a new car
- Get all cars
- Delete a car by ID
- Search cars by name (case-insensitive)
- Input validation (e.g. non-empty fields, valid year)
- H2 in-memory database for development/testing
- Swagger UI for live API documentation
- Postman collection for API testing
- Clean, production-grade Maven structure

---

## ⚙️ Tech Stack

- Java 21
- Spring Boot 3.5.4
- Spring Web
- Spring Data JPA
- H2 Database
- Swagger (springdoc-openapi)
- Lombok
- Maven

---

## 📦 Project Structure

```
car-api/
├── src/
│   ├── main/
│   │   ├── java/com/inter/carapi/
│   │   │   ├── controller/CarController.java
│   │   │   ├── model/Car.java
│   │   │   └── repository/CarRepository.java
│   │   └── resources/application.properties
├── car-api.postman_collection.json
├── pom.xml
└── README.md
```

---

## 🛠️ Getting Started

### 1. Clone and Open

```bash
git clone https://github.com/fuzail-pixel/car-api-springboot.git
cd car-api-springboot
```

### 2. Build the Project

```bash
mvn clean install
```

### 3. Run the Application

```bash
mvn spring-boot:run
```

App runs at:

```
http://localhost:8080
```

---

## 📂 API Endpoints

| Method | Endpoint                 | Description         |
| ------ | ------------------------ | ------------------- |
| GET    | `/cars`                  | Get all cars        |
| POST   | `/cars`                  | Add a new car       |
| DELETE | `/cars/{id}`             | Delete a car by ID  |
| GET    | `/cars/search?name=Ford` | Search cars by name |

---

## 📝 Sample POST Request Body

```json
{
  "name": "Mustang",
  "type": "Sports",
  "brand": "Ford",
  "year": 2023
}
```

---

## 🔍 Input Validation

Validation is applied using annotations on the `Car` entity.

| Field | Rule                  |
| ----- | --------------------- |
| name  | Must not be blank     |
| type  | Must not be blank     |
| brand | Must not be blank     |
| year  | Between 1886 and 2050 |

> If validation fails, Spring will return a `400 Bad Request`.

---

## 🧪 Testing with Postman

Use the included Postman collection to test all APIs.

### 📄 File: `car-api.postman_collection.json`

### How to Import:

1. Open Postman
2. Click **Import**
3. Select the `.json` file
4. Run any request

---

## 📘 Swagger API Documentation

Access Swagger UI to test your API live in the browser.

```
http://localhost:8080/swagger-ui.html
```

or

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🛢️ H2 Database Console

Access the H2 in-memory database from your browser:

```
http://localhost:8080/h2-console
```

### DB Settings:

| Field    | Value                |
| -------- | -------------------- |
| JDBC URL | `jdbc:h2:mem:testdb` |
| Username | `sa`                 |
| Password | (leave blank)        |

---

## 🔒 Dependency Security

* Overridden vulnerable dependency:

  ```
  org.apache.commons:commons-lang3:3.17.0 → 3.14.0
  ```

---

## 📤 Submission

Please include the following in your submission:

* Full source code
* `README.md` (this file)
* `car-api.postman_collection.json`
* `pom.xml`

You may zip the project or push it to GitHub and share the link.

---

## 👨‍💻 Developed by

**Fuzail Rehman**  
📧 [fuzailcl@gmail.com](mailto:fuzailcl@gmail.com)  
🔗 [linkedin.com/in/fuzail-rehman-31a755241/](https://linkedin.com/in/fuzail-rehman-31a755241/)  
🔗 [github.com/fuzail-pixel](https://github.com/fuzail-pixel)
