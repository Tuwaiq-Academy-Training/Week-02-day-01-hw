package com.example.hw5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.util.Date;
@RestController
public class nameController {
    Date d=new Date();
    @GetMapping("/first")
    public String Fname() {
        return "Anhar";
    }
    @GetMapping("/Sname")
    public String Lname() {
        return "Awadh";
    }
    @GetMapping("/date")
    public String DateSer() {

        return d.toString();
    }
}
