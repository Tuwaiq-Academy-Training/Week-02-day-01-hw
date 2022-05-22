package com.example.FaisalSaud.controllers;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class NameController {
    String firstName = "Faisal";
    String lastName = "Alshamrani";



   @GetMapping("/date")
       public String date() {
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
       Date date = new Date(System.currentTimeMillis());
       String time = formatter.format(date);
       return time;
   }
    @GetMapping("/firstName")
    public String firstName(){
        return "First Name is: " + firstName;
    }
    @GetMapping("/lastName")
    public String lastName(){
        return lastName;
    }
}

