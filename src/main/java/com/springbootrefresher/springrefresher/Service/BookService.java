package com.springbootrefresher.springrefresher.Service;

import com.springbootrefresher.springrefresher.Entity.Book;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BookService {

    public List<Book> getBookList(){
        return List.of(
                new Book(
                        1l,
                        "Dune",
                        "Frank Herbert",
                        "Sci-Fi",
                        1965
                )
        );
    }
}
