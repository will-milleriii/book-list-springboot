package com.springbootrefresher.springrefresher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringRefresherApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRefresherApplication.class, args);
	}

}
