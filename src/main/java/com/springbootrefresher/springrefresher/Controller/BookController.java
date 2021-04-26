package com.springbootrefresher.springrefresher.Controller;

import com.springbootrefresher.springrefresher.Entity.Book;
import com.springbootrefresher.springrefresher.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/book")
public class BookController {


    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getBookList(){
        return bookService.getBookList();
    }

}
