package com.example.StringDay1.test;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Food {
    private ArrayList<String> food=new ArrayList<>();

    @GetMapping("food")
    public ArrayList<String> getFood(){
        return  food;
    }

    @PostMapping("food")
    public String postFood(@RequestBody String name){
        food.add(name);
        return "add new food";
    }

    @PutMapping("food/{index}")
    public String putFood(@PathVariable int index,@RequestBody String name) {
        food.set(index,name);
        return "update new food";
    }

    @DeleteMapping("food/{index}")
    public String  deleteFood(@PathVariable int index) {
        food.remove(index);
        return "delete food";
    }
}
