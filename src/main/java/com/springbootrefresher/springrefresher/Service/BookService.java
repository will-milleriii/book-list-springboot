package com.springbootrefresher.springrefresher.Service;

import com.springbootrefresher.springrefresher.Entity.Book;
import com.springbootrefresher.springrefresher.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> getBookList(){
        return bookRepository.findAll();
    }
}
