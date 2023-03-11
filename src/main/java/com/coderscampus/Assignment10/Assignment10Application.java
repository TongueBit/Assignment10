package com.coderscampus.Assignment10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.coderscampus.web")
@SpringBootApplication
public class Assignment10Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment10Application.class, args);
	}

}
