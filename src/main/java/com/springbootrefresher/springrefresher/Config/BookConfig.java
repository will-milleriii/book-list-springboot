package com.springbootrefresher.springrefresher.Config;

import com.springbootrefresher.springrefresher.Entity.Book;
import com.springbootrefresher.springrefresher.Repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {

    @Bean
    CommandLineRunner commandLineRunner(BookRepository bookRepository){
        return args -> {
            Book dune = new Book(
                    "Dune",
                    "Frank Herbert",
                    "Sci-Fi",
                    1965
            );

            Book jocko = new Book(
                    "Extreme Ownership",
                    "Jocko Willink",
                    "Biography",
                    2015
            );

            bookRepository.saveAll(
                    List.of(dune, jocko)
            );
        };
    }
}
