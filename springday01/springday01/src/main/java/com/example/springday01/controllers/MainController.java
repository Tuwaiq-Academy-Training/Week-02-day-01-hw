package com.example.springday01.controllers;
/* to define the endpoint and each endpoint
 should have method and door */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

//Json file
@RestController
public class MainController {
    private ArrayList<String> users=new ArrayList<>();
    //the door
    @GetMapping("user")
    //the path http://localhost:8080/hey
    public ArrayList getHeyMessage(){
        return users;
    }

    @PostMapping("user")
    //the path http://localhost:8080/hey
    public ArrayList postHeyMessage(){
        users.add("Amaal");
        return users;
    }
    @PutMapping("user")
    //the path http://localhost:8080/hey
    public ArrayList putHeyMessage(){
        users.set(0,"Amaal Ahmed");
        return users;
    }
    @DeleteMapping("user")
    //the path http://localhost:8080/hey
    public ArrayList deleteHeyMessage(){
        users.remove(0);
        return users;
    }
}
