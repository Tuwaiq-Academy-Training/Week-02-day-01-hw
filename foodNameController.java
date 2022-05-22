package Trining11.Trining1week2.foodNameController;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
@RestController
public class foodNameController {
    private ArrayList<String> foods = new ArrayList<>();
    @GetMapping("food")
    public ArrayList<String> getFoods() {
        return foods;
    }
    @PostMapping("food")
    public String addFoods(@RequestBody String name) {
        foods.add(name);
        return "Add Foods: " + name + " To Array list";
    }
    @PutMapping("food/{index}")
    public String putFoodes(@PathVariable int index, @RequestBody String name){
        foods.set(index,name);
        return "Edite Foods Name";
    }
    @DeleteMapping("food/{index}")
    public ArrayList<String> removeFoods(@PathVariable int index){
        System.out.println(index);
        foods.remove(index);
        return foods;
    }
}
