package Trining11.Trining1week2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.util.ArrayList;
@RestController
public class nameController {
    private ArrayList<String> name = new ArrayList<>();
    @GetMapping("name")
        public LocalDate getName() {
        return LocalDate.now();
    }
    @GetMapping("firstName")
    public String getFirst() {
        return "Khaled";
    }
    @GetMapping("lastName")
    public String getLast() {
        return "Mojahed";
    }


}
