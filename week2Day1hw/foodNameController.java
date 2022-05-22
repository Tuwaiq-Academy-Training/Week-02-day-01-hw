package com.example.week2Day1hw;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class foodNameController {

    private ArrayList<String> foodsName = new ArrayList<>();


    @GetMapping("foodName")
    public ArrayList<String> getFood(){
        return foodsName;
    }

    @PostMapping("foodName")
    public String addFood(@RequestBody String food){
        foodsName.add(food);
        return food;
    }

    @PutMapping("foodName/{index}")
    public String editFood(@PathVariable int index, @RequestBody String food){
        foodsName.set(index,food);
        return "Food is Update";
    }

    @DeleteMapping("foodName/{index}")
    public String deleteFood(@PathVariable int index){
        foodsName.remove(index);
        return "Deleted is done";
    }
}
