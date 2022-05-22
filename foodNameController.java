package com.example.firstspringboot.comntroller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class foodNameController {

    ArrayList<String> foods = new ArrayList<>();
    @GetMapping("/food")
    public ArrayList<String> food(){
        return foods;
    }


    //add to next
    @PostMapping("food")
    public String addUser(@RequestBody String food){
        foods.add(food);
        return  "The food was added";
    }

    //add with spice index
    @PutMapping("food/{index}")
    public String putUser(@PathVariable int index, @RequestBody String food){
        foods.set(index, food);
        return "good";
    }

    //delete
    @DeleteMapping("food/{index}")
    public String deleteUser(@PathVariable int index){
        foods.remove(index);
        return "food is deleted";
    }


}
