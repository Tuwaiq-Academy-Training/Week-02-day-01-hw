package com.example.week2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class Book {

private ArrayList<String> books=new ArrayList<>();

@GetMapping("book")
    public ArrayList<String> getBooks(){

    return books;
}


    @PostMapping ("book")
    public ArrayList<String> addBooks(){
      books.add("Math");
        return books;
    }



    @PutMapping("book")
    public ArrayList<String> editBooks(){
        books.set(0,"Art");
        return books;
    }


    @DeleteMapping("book")
    public ArrayList<String> deleteBooks(){
        books.remove(0);
        return books;
    }




}
