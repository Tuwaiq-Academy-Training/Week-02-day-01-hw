package com.example.springday01;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class employeeController {
    private ArrayList<String> employees=new ArrayList<>();
    @GetMapping("/employee")
    public ArrayList<String> getEmployees(){
        return employees;
    }
    @PostMapping("/employee")
    public String addEmployee(@RequestBody String employee_name){
        employees.add(employee_name);
        return "Employee Added Successfully";
    }
    @PutMapping("/employee/{index}")
    public String updateBook(@PathVariable int index, @RequestBody String newEmployee_name){
        employees.set(index,newEmployee_name);
        return "Employee Updated Successfully";
    }
    @DeleteMapping("/employee/{index}")
    public String deleteBook(@PathVariable int index){
        employees.remove(index);
        return "Employee Deleted Successfully";

    }
}
