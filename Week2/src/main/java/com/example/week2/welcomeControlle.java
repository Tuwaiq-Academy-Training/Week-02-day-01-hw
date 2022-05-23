package com.example.week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class welcomeControlle {


    @GetMapping("hey")
    public String gethey(){

        return "Hey";
    }

    @GetMapping("bye")
    public String getbye(){
        return "Bey";
    }


    @GetMapping("check/status")
    public String getCheck(){
        return "Everything OK";


    }

    @GetMapping("health")
    public String  getHealth(){
        return "Server health is up and running";
    }



}
