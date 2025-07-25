package com.example.BookAPI.service;

import com.example.BookAPI.model.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookService {
    private Map<Integer,Book> bookList=new HashMap<>();

    public Book createBook(Book book){
        bookList.put(book.getId(),book);
        return book;
    }

    public Book getBookByID(int id){
        return bookList.get(id);
    }

    public List<Book> getAllBooks(){
        return new ArrayList<>(bookList.values());
    }

    public Book updateBook(int id, Book book){
        book.setId(id);
        bookList.put(book.getId(),book);
        return book;
    }

    public String deleteBook(int id){
       bookList.remove(id);
       return String.format("Book with id: %s was deleted",id);
    }
}
