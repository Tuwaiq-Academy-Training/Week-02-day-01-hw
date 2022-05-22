package com.example.spring01.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class NameController {

    @GetMapping("Date")
    public String date(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        return simpleDateFormat.format(new Date());
    }
    @GetMapping("fName")
    public String getMyMessage(){
        return ("Ammar");
    }

    @GetMapping("lNname")
    public String homeMsg(){
        return " Al-Otaibi";
    }
}
