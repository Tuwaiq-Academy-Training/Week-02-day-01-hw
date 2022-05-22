package com.example.Week2Day1HW;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController

public class nameController {

    LocalDate localDate = LocalDate.now();

    @GetMapping("Date")
    public LocalDate getDate(){
        return LocalDate.now();



    }

    @GetMapping("fname")
    public String getFname(){
        return "Turki";
    }



    @GetMapping("lname")
    public String getLname(){
        return "Alasmari";
    }
}
