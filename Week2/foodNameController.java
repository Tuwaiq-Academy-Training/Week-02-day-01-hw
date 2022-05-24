package com.example.week2hw1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class foodNameController {


    private ArrayList<String> foodi=new ArrayList<>();

    @GetMapping("food")
    public ArrayList<String> getCEmployees(){
        return foodi;
    }


    @PostMapping("food")
    public ArrayList<String> addEmployees(@RequestBody String food){
        foodi.add(food);
        return foodi;
    }



    @PutMapping("food/{index}")
    public ArrayList<String> editFood( @PathVariable int index ,@RequestBody String food){
        foodi.set(index,food);
        return foodi;
    }


    @DeleteMapping("food/{index}")
    public ArrayList<String> deleteFood(@PathVariable int index){
        foodi.remove(index);
        return foodi;
    }

}

