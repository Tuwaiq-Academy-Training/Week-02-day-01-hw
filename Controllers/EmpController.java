package com.example.spring01.Controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmpController {
    ArrayList<String> employees = new ArrayList<>();

    @GetMapping("employee")
    public ArrayList<String> getEmployees(){
        return employees;
    }

    @PostMapping("employee")
    public String addEmployee(@RequestBody String employeeName){
        employees.add(employeeName);
        return employeeName + " has been added to the list";
    }

    @PutMapping("employee/{index}")
    public String updateEmpList(@PathVariable int index, @RequestBody String employeeName){
        employees.set(index, employeeName);
        return employeeName + " was added at index " + index;
    }

    @DeleteMapping("employee/{index}")
    public String deleteEmployee(@PathVariable int index){
        String emp = employees.remove(index);
        return emp + " has been removed";

    }

}
