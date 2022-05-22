package com.example.javaDay01.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class employeeController {
    private ArrayList<String> employees = new ArrayList<>();
    @GetMapping("employee")
    public ArrayList<String> getEmployees(){
        return employees;
    }
    @PostMapping("employee/add")
    public String  postEmployee(@RequestBody String employeeName){
        employees.add(employeeName);
        return "Employee added";
    }
    @PutMapping("employee/update/{index}")
    public String  putEmployee(@PathVariable Integer index, @RequestBody String employeeName){
        employees.set(index,employeeName);
        return "employee name updated";
    }
    @DeleteMapping("employee/delete/{index}")//dynamic route,
    public String deleteBook(@PathVariable Integer index){
        employees.remove(index);
        return "employee deleted";
    }

}
