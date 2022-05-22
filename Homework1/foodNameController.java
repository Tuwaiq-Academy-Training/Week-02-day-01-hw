package com.example.demo.Homework1;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class foodNameController {

    private ArrayList<String> foods = new ArrayList<>();

    @GetMapping("food")
    public ArrayList<String> getFood() {
        return foods;
    }

    //add data
    @PostMapping("food")
    public String addFood(@RequestBody String name) {
        foods.add(name);
        return "Array added";
    }

    //edit data
    @PutMapping("food/{index}")
    public String putFood(@PathVariable int index, @RequestBody String name) {
        foods.set(index, name);
        return "Index " + index + " updated to " + name;
    }

    //delete data
    @DeleteMapping("food/{index}")
    public String deleteFood(@PathVariable int index) {
        System.out.println(index);
        foods.remove(index);
        return "Array deleted";
    }
}
