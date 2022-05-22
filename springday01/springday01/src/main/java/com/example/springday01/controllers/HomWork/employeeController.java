package com.example.springday01.controllers.HomWork;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class employeeController {

    ArrayList<String> employees=new ArrayList<>();
    @GetMapping("employee")
    public ArrayList<String> getEmployee(){
        return employees;
    }

    @PostMapping("employee")
    public ArrayList postEmployee(@RequestBody String employee){
        employees.add(employee);
        return employees;
    }

    @PutMapping("employee/{index}")
    public ArrayList putEmployee(@PathVariable int index,@RequestBody String employee){
        employees.set(index,employee);
        return employees;

    }

    @DeleteMapping("employee/{index}")
    public String deleteEmployee(@PathVariable int index){
        System.out.println(index);
        employees.remove(index);
        return "has been removed";
    }
}
