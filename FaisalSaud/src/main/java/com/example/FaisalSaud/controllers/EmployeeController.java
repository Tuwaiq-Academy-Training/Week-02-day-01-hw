package com.example.FaisalSaud.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController

public class EmployeeController {

    ArrayList<String> ArrEmployee = new ArrayList<>();

    @GetMapping("employee")
    // GET EMPLOYEE
    public ArrayList<String> EmployeeGet(){
        return ArrEmployee;
    }
    @PostMapping("employee")
    // ADD EMPLOYEE
    public String EmployeePost(@RequestBody String EmpName) {
        ArrEmployee.add(EmpName);
        return "Employee Added: " + EmpName;
    }
    @PutMapping("employee/{index}")
    // UPDATE EMPLOYEE
    public String EmployeePut(@PathVariable int index,@RequestBody String EmpName){
        ArrEmployee.set(index,EmpName);
        return "Employee Updated: " + EmpName;
    }

    @DeleteMapping("employee/{index}")
    // DELETE EMPLOYEE
    public String EmployeeDelete(@PathVariable int index){
        ArrEmployee.remove(index);
        return "Employee Deleted";
    }

}
