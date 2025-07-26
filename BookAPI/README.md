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
## 📸 Postman Snapshots

Below are the Postman screenshots demonstrating each feature of the API:

- **POST /api/books** – Create a new book  
  <img width="1442" height="761" alt="image" src="https://github.com/user-attachments/assets/b78d4f0f-839c-45ff-95f7-869315d17437"  style="border: 2px solid black"/>


- **GET /api/books** – Retrieve all books  
  <img width="1447" height="959" alt="image" src="https://github.com/user-attachments/assets/da71e999-9be6-4be3-8df6-3653f5e20651" />


- **GET /api/books/{id}** – Retrieve book by ID  
  <img width="1446" height="568" alt="image" src="https://github.com/user-attachments/assets/42abaee1-6c5b-4924-97d4-2f00c603a562" />


- **PUT /api/books/{id}** – Update book details  
 <img width="1449" height="727" alt="image" src="https://github.com/user-attachments/assets/ba13ceea-2d93-44a6-9e76-594c12d7bb88" />


- **DELETE /api/books/{id}** – Delete a book by ID  
 <img width="1446" height="535" alt="image" src="https://github.com/user-attachments/assets/b26a7a48-25f8-4571-aa06-2bbf0f7be75d" />

## 🛠 Setup & Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/BookAPI.git
   cd BookAPI
