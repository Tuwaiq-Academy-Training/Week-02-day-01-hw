package com.example.hw5;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class foodNameController {
    ArrayList<String> food=new ArrayList<>();


    @GetMapping("food/{index}")
    public ArrayList<String> getfood() {

        return  food;
    }
    @PostMapping("food")
    public String addemploy(@RequestBody String name) {
        food.add(name);
        return "New food add";
    }
    @PutMapping("food/{index}")
    public String editemploy(@PathVariable int index,@RequestBody String book1) {
        food.set(index,book1);
        return "Edit food";
    }
    @DeleteMapping("food/{index}")
    public String deltBook(@PathVariable int index) {
        food.remove(index);
        return "remove food";
    }
}
