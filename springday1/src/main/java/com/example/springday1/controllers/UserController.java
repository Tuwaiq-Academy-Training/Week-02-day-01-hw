package com.example.springday1.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {

    private ArrayList<String> users = new ArrayList<>();


    @GetMapping("user")
    public String getUser(){
        return users.get(0);
    }

    @GetMapping("users")
    public ArrayList<String> getUsers(){
        return users;
    }

    @PostMapping("user")
    public String addUser(@RequestBody String name) {
        this.users.add(name);
        return "User Added Successfully!";
    }

    @PutMapping("user")
    public String putUser() {
        this.users.set(0,"Salah Abdullah");
        return "User Updated Successfully!";
    }

    @DeleteMapping("user")
    public String deleteUser() {
        this.users.remove(0);
        return "User deleted Successfully!";
    }
}
