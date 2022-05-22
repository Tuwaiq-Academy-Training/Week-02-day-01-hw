package com.example.Week2Day1HW;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class foodNameController {

    private ArrayList<String> FoodNames = new ArrayList<>();



    @GetMapping("foodname")
    public ArrayList<String> getFoodNames(){

        return FoodNames;


    }

    @PostMapping("foodname")
    public ArrayList<String> addNewFood( @RequestBody String foodName){
        FoodNames.add(foodName);
        return FoodNames;
    }



//
//
    // im trying two diff methods
    @PutMapping("foodname")
    public String updateFoodName(){
        FoodNames.set(1,"Steak");
        return "food updated";
    }




//    @PutMapping("foodname/{index}")
//    public ArrayList<String> updateFood(@RequestBody int index , ArrayList<String> foodsNames){
//        employeesNames.set(2, "Burger");
//        return EmployeesNames;
//    }





    @DeleteMapping("foodname/{index}")
    public ArrayList<String> removeFoodName(@PathVariable int index){
        FoodNames.remove(index);
        return FoodNames;

    }


}
