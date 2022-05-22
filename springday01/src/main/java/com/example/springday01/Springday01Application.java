package com.example.springday01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class Springday01Application {

	public static void main(String[] args) {
		SpringApplication.run(Springday01Application.class, args);
	}

	@Bean
	public static String getMessage1(){
		System.out.println("this is inside message 1");
		return "this string is passed to the next method that has a string inside of its parameters from message 1";
	}

	@Bean
	public static String getMessage2(String name){
		System.out.println("this is inside message 2");
		System.out.println(name);
		return "Hello";

	}




}
