package com.example.springday1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class Springday1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springday1Application.class, args);
	}

//	@Primary
//	@Qualifier("1")
	@Bean
	public static String heyM() {
		System.out.println("heyM(): Hello from spring");
		return "heyM(): Hello from spring";
	}

//	@Primary
	@Qualifier("1324")
	@Bean
	public static String heyM2() {
		System.out.println("heyM2(): Hello from spring");
		return "heyM2(): Hello from spring";
	}


//	@Bean
//	public static String nameSomething(@Qualifier("1324") String name) {
//		System.out.println("returned name is: " + name);
//		return ";";
//	}

}
