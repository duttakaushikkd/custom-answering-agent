package com.example.CustomAnswerAgent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomAnswerAgentApplication {

	public static void main(String[] args) {

		System.out.println("KEY=" + System.getenv("OPENAI_API_KEY"));
		SpringApplication.run(CustomAnswerAgentApplication.class, args);
	}

}
