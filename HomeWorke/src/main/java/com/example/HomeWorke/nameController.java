package com.example.HomeWorke;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nameController {

    @GetMapping("date")
    public LocalDate getDate(){
        return LocalDate.now();
    }

   @GetMapping("firstName")
    public String getFirstName(){
        return "may";
   }

    @GetMapping("lastName")
    public String getLastName(){
        return "Alhumud";
    }
}






