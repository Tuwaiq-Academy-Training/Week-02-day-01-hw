package com.example.week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class nameController {
    LocalDate localDate=LocalDate.now();

    @GetMapping("data")
    public String getData(){
        return "data is"+ localDate;


    }

    @GetMapping("firstname")
    public String getFirstname(){
        return "Atheer";


    }


    @GetMapping("lastname")
    public String getLastname(){
        return "Ahmed";


    }


}
