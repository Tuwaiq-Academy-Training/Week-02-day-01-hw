package com.example.springday1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class nameController {
    private String firstName="Salah",lastName="AlSalman";

    @GetMapping("date")
    public String getDate(){
        Date date = new Date();
        String strDateFormat = "hh:mm:ss a";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        String formattedDate= dateFormat.format(date);
        System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate);
        return formattedDate;
    }

    @GetMapping("firstName")
    public String getFirstName(){
        return this.firstName;
    }

    @GetMapping("lastName")
    public String getLastName(){
        return this.lastName;
    }



}
