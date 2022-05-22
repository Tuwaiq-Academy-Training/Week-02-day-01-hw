package camp.example.springhw1;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nameController {

    @GetMapping( "date")
    public String getDate(){
        Date currentDate = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MMM/yyyy");
        String dateOnly = dateFormat.format(currentDate);

        return dateOnly;
    }

    @GetMapping( "firstname")
    public String getfName(){
        return "Reem";
    }

    @GetMapping( "lastname")
    public String getlName(){
        return "Albattah";
    }

}
