package com.example.springday1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("hey")
    public String hey(){
        return "Hey from spring";
    }

    @GetMapping("bye")
    public String bye(){
        return "Bye";
    }

    @GetMapping("check/status")
    public String status() {
        return "Everything OK";
    }

    @GetMapping("health")
    public String getHealth () {
        return "Server health is up and running";
    }


}
