package com.example.SpringHW1.employeeController;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class employeeController {

    private ArrayList<String> employees = new ArrayList<>();

    @GetMapping("employee")
    public ArrayList<String> getEmployee() {
        return employees;
    }

    @PostMapping("employee")
    public String addEmployee(@RequestBody String name) {
        employees.add(name);
        return "Added";
    }

    @PutMapping("employee/{index}")
    public String putEmployee(@PathVariable int index, @RequestBody String name) {
        employees.set(index, name);
        return "Index " + index + " updated to " + name;
    }

    @DeleteMapping("employee/{index}")
    public String deleteEmployee(@PathVariable int index) {
        System.out.println(index);
        employees.remove(index);
        return "Deleted";
    }
}
