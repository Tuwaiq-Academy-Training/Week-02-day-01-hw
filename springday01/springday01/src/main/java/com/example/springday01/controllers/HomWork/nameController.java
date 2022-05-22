package com.example.springday01.controllers.HomWork;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class nameController {

    @GetMapping("server")
    public Date getDate(){
        Date date = new Date();
        return date;
    }

    @GetMapping("first")
    public String getFirstName(){
        return "Amaal";
    }

    @GetMapping("last")
    public String getLastName(){
        return "Alzhrani";
    }
}
