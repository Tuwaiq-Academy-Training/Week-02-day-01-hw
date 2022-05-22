package com.example.hw5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Hw5Application {

    public static void main(String[] args) {
        SpringApplication.run(Hw5Application.class, args);
    }

}
