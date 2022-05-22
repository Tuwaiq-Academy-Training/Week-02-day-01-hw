package com.example.firstspringboot.comntroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController

public class nameController {
    String firstName = "Abdullah";
    String lastName  = "Almasar";


    @GetMapping("/date")
    public String date(){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        String time = formatter.format(date);
        return time;
    }
    @GetMapping("/firstName")
    public String firstName(){
        return firstName;
    }
    @GetMapping("/lastName")
    public String lastName(){
        return lastName;
    }

}
