package com.example.HomeWorke;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class foodNameController {


        private ArrayList<String> foods = new ArrayList<>();
        @GetMapping("food")
        public ArrayList<String> getEmployee() {
            return foods;
        }

        @PostMapping("food")
        public String addBook(@RequestBody String name) {
            foods.add(name);
            return "Array added";
        }

        @PutMapping("food/{index}")
        public String putBook(@PathVariable int index, @RequestBody String username) {
            foods.set(index, username);
            return "Index " + index + "updated to" + username;
        }

        @DeleteMapping("food/{index}")
        public String deleteUser(@PathVariable int index) {
            System.out.println(index);
            foods.remove(index);
            return "Array deleted";
        }


    }


