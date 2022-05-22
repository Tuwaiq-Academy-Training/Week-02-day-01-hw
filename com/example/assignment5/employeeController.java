package com.example.assignment5;

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
    public ArrayList<String> addEmployees(){
        employees.add("Sara");
        return employees;
    }

    @PutMapping("employee")
    public ArrayList<String> editEmployees(){
        employees.set(0,"Noura");
        return employees;
    }

    @DeleteMapping("employee")
    public ArrayList<String> deleteMapping(){
        employees.remove(0);
        return employees;
    }

}
