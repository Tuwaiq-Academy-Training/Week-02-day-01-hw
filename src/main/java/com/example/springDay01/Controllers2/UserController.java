package com.example.springDay01.Controllers2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {

    private ArrayList<String> users = new ArrayList<>();

    @GetMapping("user")
    public ArrayList<String> getUsers(){

        return users;
    }

    @PostMapping("user")
    public String addUsers(){
        users.add("Ahmed");
        return "User added";
    }
    @PutMapping("user")
    public String updateUsers(){
        users.set(0,"Alsulami");
        return "Users are updated";
    }
    @DeleteMapping("user")
    public String deleteUsers(){
        users.remove(0);
        return "User removed";
    }
}
