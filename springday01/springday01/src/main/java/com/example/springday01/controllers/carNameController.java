package com.example.springday01.controllers;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class carNameController {

    ArrayList<String> cars=new ArrayList<>();
    @GetMapping("car")
    public ArrayList<String> getCar(){
        return cars;
    }

    @PostMapping("car")
    public ArrayList postCar(@RequestBody String car){
        cars.add(car);
        return cars;
    }

    @PutMapping("car/{index}")
    public ArrayList putCar(@PathVariable int index,@RequestBody String car){
        cars.set(index,car);
        return cars;

    }

    @DeleteMapping("car/{index}")
    public String deleteCar(@PathVariable int index){
        System.out.println(index);
        cars.remove(index);
        return "has been removed";
    }

}
