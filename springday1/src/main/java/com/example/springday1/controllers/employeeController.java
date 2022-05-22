package com.example.springday1.controllers;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class employeeController {

    ArrayList<String> employees = new ArrayList<>();

    @GetMapping("employee")
    public ArrayList<String> getEmployees(){
        return employees;
    }

    @PostMapping("employee")
    public String postEmployee(@RequestBody String name) {
        this.employees.add(name);
        return "Employee Added Successfully!";
    }


    @PutMapping("employee/{index}")
    public String putEmployee(@PathVariable int index, @RequestBody String name) {
        this.employees.set(index, name) ;
        return "Employee Updated Successfully!";
    }

    @DeleteMapping("employee/{index}")
    public String deleteEmployee(@PathVariable int index) {
        this.employees.remove(index);
        return "Employee Deleted Successfully!";
    }



}
