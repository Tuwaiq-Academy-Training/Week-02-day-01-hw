package com.example.assignment5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class nameController {


    LocalDate localDate = LocalDate.now();

    @GetMapping("date")
    public String getDate(){
        return "The Date is: " + localDate;

    }

    @GetMapping("fname")
    public String getFirstName(){
        return "Haneen";

    }

    @GetMapping("lname")
    public String getLastName(){
        return "Alrewaished";

    }

}
