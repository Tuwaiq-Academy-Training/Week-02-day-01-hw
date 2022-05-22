package com.example.springday01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class nameController {
@GetMapping("/date")
    public String getDate(){
    return new Date().toString();
}
    @GetMapping("/firstName")
    public String getFirstName(){
        return "Ali";
    }@GetMapping("/lastName")
    public String getLastName(){
        return "Alabdrabalrasol";
    }
}
