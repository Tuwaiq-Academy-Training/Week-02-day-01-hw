package com.example.springDay01.Controllers2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CarNameController {

    private ArrayList<String> cars = new ArrayList<>();

    @GetMapping("car")
    public ArrayList<String> getCar(){
        return cars;
    }

    @PostMapping("car/{car}")
    public String addCar(@PathVariable String car){
        cars.add(car);
        return "Add car to car array";
    }
    @PutMapping("car/{index}")
    public String updateCar(@PathVariable int index, @RequestBody String name){
        cars.set(index,name);
        return "Update car array";
    }

    @DeleteMapping("car/{index}")
    public String deleteCar(@PathVariable int index){
        cars.remove(index);
        return "Car delete from array";
    }
}
