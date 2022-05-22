package com.example.springDay01.Controllers2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MainController {
    @GetMapping("hey")
    public String hay(){
       // System.out.println("hey from controller");
        return "Hey from spring";
    }
    @GetMapping("bye")
    public String bye(){
       return "Bye";
    }
    @GetMapping("bye/check/status/")
    public String ok(){
        return "Everything OK";
    }
    @GetMapping("health")
    public String health(){
        return "health";
    }
}
