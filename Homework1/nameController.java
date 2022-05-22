package com.example.demo.Homework1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;


@RestController
public class nameController {

    //date
    @GetMapping("date")
    public LocalDate getDate() {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        return date;
    }


    //firstname
    @GetMapping("firstName")
    public String getFirstName() {
        return "Ashwaq";
    }

    //lastname
    @GetMapping("lastName")
    public String getLastName() {
        return "Alharbi";
    }

}
