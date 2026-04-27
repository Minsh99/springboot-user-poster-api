# 🚀 Spring Boot User & Poster API

A RESTful API built with Spring Boot that manages users and their posters with a one-to-many relationship.

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Postman

---

## 📊 Features

- Create and retrieve users
- Create and retrieve posters
- One-to-many relationship (User → Posters)
- RESTful API design
- JSON responses
- Connected to PostgreSQL database

---

## 🔗 API Endpoints

### 👤 Users

| Method | Endpoint | Description |
|-------|--------|-------------|
| GET | /users | Get all users |
| POST | /users | Create user |

---

### 🖼️ Posters

| Method | Endpoint | Description |
|-------|--------|-------------|
| GET | /posters | Get all posters |
| POST | /posters | Create poster |

---

## 📦 Example Request

### Create User

```json
{
  "name": "John",
  "email": "john@email.com"
}