package com.example.springday1.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class bookNameController {

    private ArrayList<String> books = new ArrayList<>();

    @GetMapping("book")
    public ArrayList<String> getBooks() {
        return books;
    }

    @PostMapping("book")
    public String postBook(@RequestBody String name) {
        this.books.add(name);
        return "Book Added Successfully!";
    }

    @PutMapping("book/{index}")
    public String putBook(@PathVariable int index, @RequestBody String name) {
        this.books.set(index, name);
        return "Book Updated Successfully!";
    }

    @DeleteMapping("book/{index}")
    public String deleteBook(@PathVariable int index) {
        this.books.remove(index);
        return "Book Deleted Successfully!";
    }
}
