# 📚 BookAPI

BookAPI is a simple RESTful web service developed using **Spring Boot**. It provides basic CRUD operations to manage a collection of books.

---

## ✅ Features

- Create a new book  
- Retrieve book details  
- Update existing book information  
- Delete a book by ID  

---

## 🔧 Technologies Used

- Java
- Spring Boot
- Spring Web
- Maven 
---

## 📡 HTTP Methods

| Method | Endpoint         | Description              |
|--------|------------------|--------------------------|
| GET    | `/api/books`     | Get all books            |
| GET    | `/api/books/{id}`| Get book by ID           |
| POST   | `/api/books`     | Add a new book           |
| PUT    | `/api/books/{id}`| Update existing book     |
| DELETE | `/api/books/{id}`| Delete book by ID        |

---

## 🛠 Setup & Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/BookAPI.git
   cd BookAPI
