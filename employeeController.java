package com.example.firstspringboot.comntroller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class employeeController {


    ArrayList<String> employees = new ArrayList<>();
    @GetMapping("/employee")
    public ArrayList<String> employee(){
        return employees;
    }


    //add to next
    @PostMapping("employee")
    public String addUser(@RequestBody String employee){
        employees.add(employee);
        return  "The employee was added";
    }

    //add with spice index
    @PutMapping("employee/{index}")
    public String putUser(@PathVariable int index, @RequestBody String employee){
        employees.set(index, employee);
        return "good";
    }

    //delete
    @DeleteMapping("employee/{index}")
    public String deleteUser(@PathVariable int index){
        employees.remove(index);
        return "employee is deleted";
    }

}
