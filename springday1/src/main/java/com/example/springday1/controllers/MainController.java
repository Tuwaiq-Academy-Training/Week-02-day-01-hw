package com.example.springday1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainController {

//    @RequestMapping(method= RequestMethod.GET, path="hey")
    @GetMapping("hey222")
    public String getHeyMessage() {
        return "Hey from Spring";
    }

    @GetMapping("hey2")
    public String getHeyMessage2() {
        return "Hi from get HeyMessage2 ";
    }

    @GetMapping("heyarr")
    public String[] getHeyarr() {
        String[] arr = {"Salah", "Khalid"};
        return arr;
    }

    @GetMapping("usergetpara")
    public String getPara(@RequestParam(name = "id") int id) {
        String[] arr = {"Salah", "Khalid"};
        return arr[id];
    }
}
