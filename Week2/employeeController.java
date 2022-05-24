package com.example.week2hw1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class employeeController {


        private ArrayList<String> employees=new ArrayList<>();

        @GetMapping("employee")
        public ArrayList<String> getCEmployees(){
            return employees;
        }


        @PostMapping("employee")
        public ArrayList<String> addEmployees(@RequestBody String employee){
            employees.add(employee);
            return employees;
        }



        @PutMapping("employee/{index}")
        public ArrayList<String> editEmployees( @PathVariable int index ,@RequestBody String employee){
            employees.set(index,employee);
            return employees;
        }


        @DeleteMapping("employee/{index}")
        public ArrayList<String> deleteEmployees(@PathVariable int index){
            employees.remove(index);
            return employees;
        }

    }

