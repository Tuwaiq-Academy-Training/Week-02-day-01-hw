package com.example.spring01.Controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class Food {
    ArrayList<String> food = new ArrayList<>();

    @GetMapping("food")
    public ArrayList<String> getFood(){
        return food;
    }

    @PostMapping("food")
    public String addFood(@RequestBody String foodName){
        food.add(foodName);
        return foodName + " has been added to the list";
    }

    @PutMapping("food/{index}")
    public String updateFood(@PathVariable int index, @RequestBody String foodName){
        food.set(index, foodName);
        return foodName + " was added at index " + index;
    }

    @DeleteMapping("food/{index}")
    public String deleteFood(@PathVariable int index){
        String fo = food.remove(index);
        return fo + " has been removed";

    }
}
