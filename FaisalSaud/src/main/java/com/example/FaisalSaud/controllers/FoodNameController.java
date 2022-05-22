package com.example.FaisalSaud.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class FoodNameController {

    ArrayList<String> ArrFood = new ArrayList<>();

    @GetMapping("food")
    public ArrayList<String> FoodGet(){
//        ArrFood.add(0,"Steak");
//        ArrFood.add(1,"Noodles");
//        ArrFood.add(2,"Burger");
        return ArrFood;
    }
    @PostMapping("food")
    public String FoodPost(@RequestBody String Food){
        ArrFood.add(Food);
        return  "Food Added: " + Food;
    }
    @PutMapping("food/{index}")
    public String FoodPut(@PathVariable int index,@RequestBody String Food ){
        ArrFood.set(index,Food);
        return "Food Updated: " + Food;
    }
    @DeleteMapping("food/{index}")
    public String FoodDelete(@PathVariable int index){
        ArrFood.remove(index);
        return "Food Deleted";
    }
}
