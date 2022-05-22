package com.example.week2Day1hw;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class employeeController {

    private ArrayList<String> employees = new ArrayList<>();

    @GetMapping("employee")
    public ArrayList<String> getEmployee(){
        return employees;
    }

    @PostMapping("employee")
    public String addEmployee(@RequestBody String employee){
        employees.add(employee);
        return employee;
    }

    @PutMapping("employee/{index}")
    public String editEmployee(@PathVariable int index, @RequestBody String employee){
        employees.set(index,employee);
        return "Update Employee";
    }

    @DeleteMapping("employee/{index}")
    public String deleteEmployee(@PathVariable int index){
        employees.remove(index);
        return "Deleted is done";
    }
}
