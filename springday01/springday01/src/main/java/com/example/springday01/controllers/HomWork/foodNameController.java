package com.example.springday01.controllers.HomWork;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class foodNameController {

    ArrayList<String> foods=new ArrayList<>();
    @GetMapping("food")
    public ArrayList<String> getFood(){
        return foods;
    }

    @PostMapping("food")
    public ArrayList postFood(@RequestBody String food){
        foods.add(food);
        return foods;
    }

    @PutMapping("food/{index}")
    public ArrayList putFood(@PathVariable int index,@RequestBody String food){
        foods.set(index,food);
        return foods;

    }

    @DeleteMapping("food/{index}")
    public String deleteFood(@PathVariable int index){
        System.out.println(index);
        foods.remove(index);
        return "has been removed";
    }

}
