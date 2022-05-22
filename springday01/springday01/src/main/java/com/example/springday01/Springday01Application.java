package com.example.springday01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
@SpringBootApplication
public class Springday01Application {
	public static void main(String[] args) {
		SpringApplication.run(
				Springday01Application.class, args);
	}

	//to run this method we don't need to
	// call this method by our self just use @Bean

	@Bean
	@Qualifier("123")
	public static String heyMessage1(){
		return "Amaal";
	}

	@Bean
	@Qualifier("1234")
	public static String heyMessage2(){
		return "Ahmed";
	}

	@Bean
	public static String heyMessage3(@Qualifier("123") String name){
		System.out.println("Hello "+name);
		return"";
	}

	@Bean
	public static String heyMessage4(@Qualifier("1234") String name){
		System.out.println("Hello "+name);
		return"";
	}

}
