package com.example.springDay01.Controllers123;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class NameController {

    @GetMapping("name")
    public LocalDateTime date(){
        return LocalDateTime.now();
    }

    @GetMapping("firstname")
    public String firstName(){
        return "Ahmed";
    }

    @GetMapping("lastname")
    public String lastName(){
        return "Alsulami";
    }


}
