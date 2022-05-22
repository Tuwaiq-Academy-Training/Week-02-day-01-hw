package com.example.demo.Homework1;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class employeeController {

    private ArrayList<String> employees = new ArrayList<>();

    @GetMapping("employee")
    public ArrayList<String> getEmployee() {
        return employees;
    }

    //add data
    @PostMapping("employee")
    public String addEmployee(@RequestBody String name) {
        employees.add(name);
        return "Array added";
    }

    //edit data
    @PutMapping("employee/{index}")
    public String putEmployee(@PathVariable int index, @RequestBody String name) {
        employees.set(index, name);
        return "Index " + index + " updated to " + name;
    }

    //delete data
    @DeleteMapping("employee/{index}")
    public String deleteEmployee(@PathVariable int index) {
        System.out.println(index);
        employees.remove(index);
        return "Array deleted";
    }
}

