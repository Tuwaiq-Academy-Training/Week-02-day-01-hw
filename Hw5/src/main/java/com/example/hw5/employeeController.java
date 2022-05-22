package com.example.hw5;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class employeeController {
    ArrayList<String> employ=new ArrayList<>();


    @GetMapping("employ")
    public ArrayList<String> getlist() {

        return  employ;
    }
    @PostMapping("employ")
    public String addemploy(@RequestBody String name) {
        employ.add(name);
        return "New employ add";
    }
    @PutMapping("employ/{index}")
    public String editemploy(@PathVariable int index,@RequestBody String book1) {
        employ.set(index,book1);
        return "Edit employ";
    }
    @DeleteMapping("employ/{index}")
    public String deltBook(@PathVariable int index) {
        employ.remove(index);
        return "remove employ";
    }
}
