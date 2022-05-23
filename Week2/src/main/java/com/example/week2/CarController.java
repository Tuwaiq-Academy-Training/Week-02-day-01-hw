package com.example.week2;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CarController {
    private ArrayList<String> cars=new ArrayList<>();

    @GetMapping("car")
    public ArrayList<String> getCars(){
        System.out.println("Hi");

        return cars;
    }


    @PostMapping("car")
    public ArrayList<String> addCars(@RequestBody String carname){
        cars.add(carname);
        return cars;
    }



    @PutMapping("car/{index}")
    public ArrayList<String> editCars( @PathVariable int index ,@RequestBody String carname){
        cars.set(index,carname);
        return cars;
    }


    @DeleteMapping("car/{index}")
    public ArrayList<String> deleteCars(@PathVariable int index){
        cars.remove(index);
        return cars;
    }

}
