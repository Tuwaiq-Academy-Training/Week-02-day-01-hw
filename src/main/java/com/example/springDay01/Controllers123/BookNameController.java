package com.example.springDay01.Controllers123;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class BookNameController {

    private ArrayList<String> books = new ArrayList<>();


    @GetMapping("book")
    public ArrayList<String> getBooks(){
        return books;
    }

    @PostMapping("book/{name}")
    private String addBooks(@PathVariable String name){
        books.add(name);
        return "Add book to array";
    }

    @PutMapping("book/{index}")
    public String updateBooks(@PathVariable int index, @RequestBody String name){
        books.set(index,name);
        return "update book array";
    }

    @DeleteMapping("book/{index}")
    public String deleteBook(@PathVariable int index){
        books.remove(index);
        return "Delete book from array";
    }
}
