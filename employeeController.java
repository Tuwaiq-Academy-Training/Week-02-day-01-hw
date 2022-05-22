package Trining11.Trining1week2.employeeController;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class employeeController {
    private ArrayList<String> employees = new ArrayList<>();
    @GetMapping("employee")
    public ArrayList<String> getEmployees() {
        return employees;
    }
    @PostMapping("employee")
    public String addEmployees(@RequestBody String name) {
        employees.add(name);
        return "Add Employees: " + name + " To Array list";
    }
    @PutMapping("employee/{index}")
    public String putEmployees(@PathVariable int index,@RequestBody String name) {
        employees.set(index,name);
        return "Edate Name Employees";
    }
    @DeleteMapping("employee/{index}")
    public ArrayList<String> removeEmployees(@PathVariable int index){
        System.out.println(index);
        employees.remove(index);
        return employees;

    }
}
