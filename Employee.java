package com.example.StringDay1.test;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Employee {
    private ArrayList<String> employee=new ArrayList<>();

    @GetMapping("employee")
    public ArrayList<String> getEmployee(){
        return  employee;
    }

    @PostMapping("employee")
    public String postEmployee(@RequestBody String name){
        employee.add(name);
        System.out.println("add new employee"+name);
        return "add new employee";
    }

    @PutMapping("employee/{index}")
    public String putEmployee(@PathVariable int index,@RequestBody String name) {
        employee.set(index,name);
        return "update new employee";
    }

    @DeleteMapping("employee/{index}")
    public String  deleteEmployee(@PathVariable int index) {
        employee.remove(index);
        return "delete employee";
    }
}
