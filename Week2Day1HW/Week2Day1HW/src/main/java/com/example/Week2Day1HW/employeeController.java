package com.example.Week2Day1HW;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class employeeController {

    private ArrayList<String> EmployeesNames = new ArrayList<>();



    @GetMapping("empname")
    public ArrayList<String> getEmployeeNames(){

        return EmployeesNames;


    }

    @PostMapping("empname")
    public ArrayList<String> addNewEmployee( @RequestBody String employeeName){
        EmployeesNames.add(employeeName);
        return EmployeesNames;
    }



//
//
//    @PutMapping("empname")
//    public String updateName(){
//        EmployeesNames.set(0,"Khalid");
//        return "emp updated";
//    }




    @PutMapping("empname/{index}")
    public ArrayList<String> updateName(@RequestBody int index , ArrayList<String> employeesNames){
        employeesNames.set(index, "");
        return EmployeesNames;
    }





    @DeleteMapping("empname/{index}")
    public ArrayList<String> removeEmployeeName(@PathVariable int index){
        EmployeesNames.remove(index);
        return EmployeesNames;

    }



}
