package com.example.assignment5;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class foodNameController {


    ArrayList<String> foodName = new ArrayList<>();

    @GetMapping("food")
    public ArrayList<String> getFoodName(){
        return foodName;
    }

    @PostMapping("food")
    public ArrayList<String> addFoodName(){
        foodName.add("Pizza");
        return foodName;
    }

    @PutMapping("food")
    public ArrayList<String> editFoodName(){
        foodName.set(1,"Pasta");
        return foodName;
    }

    @DeleteMapping("food")
    public ArrayList<String> deletefoodName(){
        foodName.remove(3);
        return foodName;
    }
}
