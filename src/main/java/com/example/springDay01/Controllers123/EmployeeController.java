package com.example.springDay01.Controllers123;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    private ArrayList<String> employees = new ArrayList<>();


    @GetMapping("employee")
    public ArrayList<String> getEmployee(){
        return employees;
    }

    @PostMapping("employee/{employee}")
    public String addCar(@PathVariable String employee){
        employees.add(employee);
        return "Add Employee to car array";
    }
    @PutMapping("employee/{index}")
    public String updateCar(@PathVariable int index, @RequestBody String name){
        employees.set(index,name);
        return "Update Employee array";
    }

    @DeleteMapping("employee/{index}")
    public String deleteCar(@PathVariable int index){
        employees.remove(index);
        return "Employee delete from array";
    }

}
