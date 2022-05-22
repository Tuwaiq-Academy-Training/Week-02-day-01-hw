package com.example.springday01;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class testcontroller {
    private ArrayList<String>list=new ArrayList<>();


    @GetMapping("user/{index}")
    public ArrayList<String>get(){
        return list;
    }

    @PostMapping("user")
    public ArrayList<String>post(@RequestBody String name){
        list.add(name);
        return list;
    }
    @PutMapping("user/{index}")
        public ArrayList<String>put(@PathVariable int index,@RequestBody String username){
        list.set(index,username);
            return list;
        }
    @DeleteMapping("user/{index}")
    public ArrayList<String>delete(@PathVariable  int index){
        list.remove(index);
        return list;
    }

}
