package com.example.springday01;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class carNameController {
    private ArrayList<String>cars=new ArrayList<>();

    @GetMapping("/car")
    public ArrayList<String> getCars(){
        return cars;
    }
    @PostMapping("/car")
    public String addCar(@RequestBody String carname){
        cars.add(carname);
        return "Car Added Successfully";
    }
    @PutMapping("/car/{index}")
    public String updateCar(@PathVariable int index, @RequestBody String newcarname){
        cars.set(index,newcarname);
        return "Car Updated Successfully";
    }
    @DeleteMapping("/car/{index}")
    public String deleteCar(@PathVariable int index){
        cars.remove(index);
        return "Car Deleted Successfully";

    }
}
