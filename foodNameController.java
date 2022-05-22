package com.example.javaDay01.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class foodNameController {
    private ArrayList<String> food = new ArrayList<>();
    @GetMapping("food")
    public ArrayList<String> getFoodNames(){

        return food;
    }
    @PostMapping("food/add")
    public String  postFoodNames(@RequestBody String foodNames){
        food.add(foodNames);
        return "food added";
    }
    @PutMapping("food/update/{index}")
    public String  putFood(@PathVariable Integer index, @RequestBody String foodNames){
        food.set(index,foodNames);
        return "food name updated";
    }
    @DeleteMapping("food/delete/{index}")//dynamic route,
    public String deleteFoodNames(@PathVariable Integer index){
        food.remove(index);
        return "food deleted";
    }
}
