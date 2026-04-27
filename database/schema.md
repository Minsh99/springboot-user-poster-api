# 📊 Database Design

## 🧑 Users Table

| Column | Type | Description |
|------|------|------------|
| id | BIGINT | Primary Key |
| name | VARCHAR | User name |
| email | VARCHAR | User email |

---

## 🖼️ Posters Table

| Column | Type | Description |
|------|------|------------|
| id | BIGINT | Primary Key |
| title | VARCHAR | Poster title |
| content | TEXT | Poster content |
| user_id | BIGINT | Foreign key → users.id |

---

## 🔗 Relationship

- One User → Many Posters
- Each Poster belongs to ONE User
