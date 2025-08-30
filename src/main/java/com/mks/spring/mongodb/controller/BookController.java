package com.mks.spring.mongodb.controller;

import com.mks.spring.mongodb.dao.BookRepo;
import com.mks.spring.mongodb.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    private BookRepo bookRepo;

    @GetMapping("/get")
    public ResponseEntity<List<Book>> getAllBook(){
        List<Book> bookList = bookRepo.findAll();
        return ResponseEntity.ok(bookList);
    }

    @PostMapping("/save")
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        return ResponseEntity.ok(bookRepo.save(book));
    }
}
