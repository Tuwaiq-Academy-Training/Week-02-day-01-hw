package com.example.FaisalSaud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class FaisalSaudApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaisalSaudApplication.class, args);


	}
	@Bean
	public String Test(){
		System.out.println("TEST TEST TEST");
		return "TEST TEST TEST";
}}
