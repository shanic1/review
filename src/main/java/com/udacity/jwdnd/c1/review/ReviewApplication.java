package com.udacity.jwdnd.c1.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReviewApplication {

	@Bean
	public String message(){
		System.out.println("In message bean");
		return "Hello, Spring!";
	}

	@Bean
	public String uppercaseMessage(MessageService messageService){
		System.out.println("In uppercase bean");
		return messageService.uppercase();
	}

	@Bean
	public String lowercaseMessage(MessageService messageService){
		System.out.println("In lower bean");
		return messageService.lowercase();
	}


	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

}
