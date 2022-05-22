package com.example.springday01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {



    // to retrieve data from we server
    @GetMapping("hey")
    public String heyMessage(){
        return "Hey from spring";
    }

    @GetMapping("bye")
    public String byeMessage(){
        return "Bye";
    }

    @GetMapping("bye/check/status")
    public String checkByeMessage(){
        return "Everything is ok";
    }

    @GetMapping("health")
    public String healthMessage(){
        return "Server health is up and running";
    }
}
