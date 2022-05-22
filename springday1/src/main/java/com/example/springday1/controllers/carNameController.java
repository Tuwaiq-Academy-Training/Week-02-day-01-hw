package com.example.springday1.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class carNameController {
    private ArrayList<String> cars = new ArrayList<>();
    @GetMapping("car")
    public ArrayList<String> getCar() {
        return cars;
    }

    @PostMapping("car")
    public String postCar(@RequestBody String carName) {
        this.cars.add(carName);
        return "Car Added Successfully!";
    }

    @PostMapping("car/{index}")
    public String putCar(@PathVariable int index,@RequestBody String name) {
        this.cars.set(index, name);
        return "Car Updated Successfully!";
    }

    @DeleteMapping("car/{index}")
    public String deleteCar(@PathVariable int index) {
        this.cars.remove(index);
        return "Car Deleted Successfully!";
    }
}
