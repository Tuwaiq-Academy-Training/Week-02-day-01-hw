package camp.example.springhw1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class foodNameController {
    public ArrayList<String> food=new ArrayList();

    @GetMapping( "food")
    public ArrayList<String> getFood(){
        return food;
    }

    @PostMapping( "food")
    public String addFood(@RequestBody String name){
        food.add(name);
        return food + "added to list";
    }

    @PutMapping( "food/{index}")
    public String updateFood(@PathVariable int index ,@RequestBody String name){
        food.set(index,name);
        return "Update";
    }

    @DeleteMapping ( "food/{index}") //danger
    public String deleteFood(@PathVariable int index){ // should have same name
        food.remove(index);
        return "Food removed";
    }
}
