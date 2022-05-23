package com.example.springday1.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class foodNameController {
    ArrayList<String> foods = new ArrayList<>();

    @GetMapping("food")
    public ArrayList<String> getFoods(){
        return foods;
    }

    @PostMapping("food")
    public String postFood(@RequestBody String name) {
        this.foods.add(name);
        return "Food Added Successfully!";
    }


    @PutMapping("food/{index}")
    public String putFood(@PathVariable int index, @RequestBody String name) {
        this.foods.set(index, name) ;
        return "Food Updated Successfully!";
    }

    @DeleteMapping("food/{index}")
    public String deleteFood(@PathVariable int index) {
        this.foods.remove(index);
        return "Food Deleted Successfully!";
    }
}
