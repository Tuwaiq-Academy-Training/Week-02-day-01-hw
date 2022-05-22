package com.example.springday01.controllers;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class bookNameController {
    ArrayList<String> books=new ArrayList<>();
    @GetMapping("book")
    public ArrayList getBook(){
        return books;
    }

    @PostMapping("book")
    public ArrayList postBook(@RequestBody String book){
            books.add(book);
            return books;
    }

    @PutMapping("book/{index}")
    public ArrayList putBook(@PathVariable int index , @RequestBody String updateName){
            books.set(index,updateName);
            return books;
    }

    @DeleteMapping("book/{index}")
    public ArrayList deleteBook(@PathVariable int index){
        books.remove(index);
        return books;
    }



}
