package com.example.StringDay1.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Name {

    @GetMapping("server")
    public Date getDate(){
        Date date = new Date();
        return date;
    }

    @GetMapping("first")
    public  String getFirstName(){
        return "Rimah";
    }
    @GetMapping("last")
    public  String Health(){
        return "Aloraini";
    }


}
