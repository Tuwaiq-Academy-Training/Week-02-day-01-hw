package com.example.HomeWorke;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class employeeController {

    private ArrayList<String> employees = new ArrayList<>();
    @GetMapping("employee")
    public ArrayList<String> getEmployee() {
        return employees;
    }
    //add data
    @PostMapping("employee")
    public String addBook(@RequestBody  String name) {
        employees.add(name);
        return "Array added";
    }
    //edit data
    @PutMapping("employee/{index}")
    public String putBook(@PathVariable int index, @RequestBody String username) {
        employees.set(index, username);
        return "Index " + index + "updated to" + username;
    }
    //delete data
    @DeleteMapping("employee/{index}")
    public String deleteUser(@PathVariable int index) {
        System.out.println(index);
        employees.remove(index);
        return "Array deleted";
    }


}
