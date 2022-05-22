package com.example.week2Day1hw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;



@RestController
public class nameController {


    @GetMapping("Date")
    public String getDate(){
        return new Date().toString();
    }

    @GetMapping("firstName")
    public String firstName(){
        return "Lina";
    }

    @GetMapping("lastName")
    public String lastName(){
        return "Aloqaily";
    }

}
