package com.example.springday01;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class foodNameController {
    private ArrayList<String> food=new ArrayList<>();
    @GetMapping("/food")
    public ArrayList<String> getFood(){
        return food;
    }
    @PostMapping("/food")
    public String addFood(@RequestBody String food_name){
        food.add(food_name);
        return "Food Added Successfully";
    }
    @PutMapping("/food/{index}")
    public String updateFood(@PathVariable int index, @RequestBody String newFood_name){
        food.set(index,newFood_name);
        return "Employee Updated Successfully";
    }
    @DeleteMapping("/food/{index}")
    public String deleteFood(@PathVariable int index){
        food.remove(index);
        return "Food Deleted Successfully";

    }
}
