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
    private int idNext=1;

    public Book createBook(Book book){
        book.setId(idNext++);
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

    public void deleteBook(int id){
       bookList.remove(id);
    }
}
