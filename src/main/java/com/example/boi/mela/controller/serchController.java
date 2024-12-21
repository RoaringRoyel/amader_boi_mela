package com.example.boi.mela.controller;

import com.example.boi.mela.entity.bookEntry;
import com.example.boi.mela.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@RestController
public class serchController {

    @Autowired
    private bookService booksearch;

//
//    @GetMapping("search/{title}") //localhost:8080/book/id/111
//    public Optional<bookEntry> getBookDeatils(@PathVariable String title){
//        return bookService.findBooksByTitlePattern(keyword);
//        //return booksearch.findByTitle(title);
////        return bookEntires.get(myID);
//    }

    @GetMapping("search/{key}") //localhost:8080/book/id/111
    public List<bookEntry> getBookSearch(@PathVariable String key){
        return booksearch.findBooksByTitlePattern(key);
        //return booksearch.findByTitle(title);
//        return bookEntires.get(myID);
    }

}
