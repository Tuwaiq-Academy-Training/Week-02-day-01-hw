package com.example.javaDay01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

@RestController
public class nameController {
    private ArrayList<String> names = new ArrayList<>();
    private LocalDateTime now = LocalDateTime.now();
    Date date = new Date();

    @GetMapping("date")
    public LocalDateTime getDate(){
        return now;

    }
    @GetMapping("date/firstname")
    public String getFirstName(){
        return "Abdulrahman";
    }
    @GetMapping("date/lastname")
    public String getLastName(){
        return "Albalood";
    }

}
