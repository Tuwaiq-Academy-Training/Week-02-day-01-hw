package com.example.springday01;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class bookNameController {
    private ArrayList<String>books=new ArrayList<>();
    @GetMapping("/book")
    public ArrayList<String> getBooks(){
        return books;
    }
    @PostMapping("/book")
    public String addBook(@RequestBody String bookname){
       books.add(bookname);
        return "Book Added Successfully";
    }
    @PutMapping("/book/{index}")
    public String updateBook(@PathVariable int index, @RequestBody String newbookname){
        books.set(index,newbookname);
        return "Book Updated Successfully";
    }
    @DeleteMapping("/book/{index}")
    public String deleteBook(@PathVariable int index){
        books.remove(index);
        return "Book Deleted Successfully";

    }

}
