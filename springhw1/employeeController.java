package camp.example.springhw1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class employeeController {

    public ArrayList<String> employee=new ArrayList();

    @GetMapping( "employee")
    public ArrayList<String> getEmployee(){
        return employee;
    }

    @PostMapping( "employee")
    public String addEmployee(@RequestBody String name){
        employee.add(name);
        return employee + "added to list";
    }

    @PutMapping( "employee/{index}")
    public String updateEmployee(@PathVariable int index ,@RequestBody String name){
        employee.set(index,name);
        return "Update";
    }

    @DeleteMapping ( "employee/{index}") //danger
    public String deleteEmployee(@PathVariable int index){ // should have same name
        employee.remove(index);
        return "Employee removed";
    }
}
