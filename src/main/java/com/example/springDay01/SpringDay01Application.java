package com.example.springDay01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringDay01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDay01Application.class, args);
	}

	@Bean
	public static String helloMassage(){
		System.out.println("Hay from spring");
		return "Ahmed";
	}

}
