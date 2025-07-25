package com.example.BookAPI.controller;

import com.example.BookAPI.model.Book;
import com.example.BookAPI.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/")
    public String getBook(){
        return "Book Found!";
    }

    @PostMapping("/api/book")
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @GetMapping("api/book/{id}")
    public Book getBookById(@PathVariable int id){
        return bookService.getBookByID(id);
    }

    @GetMapping("api/book")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PutMapping("api/book/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book){
        return bookService.updateBook(id,book);
    }

    @DeleteMapping("/api/book/{id}")
    public String deleteBook(@PathVariable int id){
        return bookService.deleteBook(id);
    }
}
