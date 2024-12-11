package com.example.boi.mela.controller;

import com.example.boi.mela.entity.bookEntry; //
import com.example.boi.mela.service.bookCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/book")
public class BoimelaController {
    @Autowired
    private bookCollection bookcollection; //service part

    @PostMapping //localhost:8080/book
    public boolean createEntry(@RequestBody bookEntry bookentry){ //which table /document's data ?
        bookcollection.saveEntry(bookentry); //calling the service to entry the Data
        return true;
    }


}


//    private Map<Integer, bookEntry> bookEntires = new HashMap<>();
//
//    @GetMapping //localhost:8080/book
//    public List<bookEntry> getAll(){
//        return new ArrayList<>(bookEntires.values());
//    }
//
//    @PostMapping //localhost:8080/book
//    public boolean createEntry(@RequestBody bookEntry bookentry){
//        bookEntires.put(bookentry.getId(), bookentry);
//        return true;
//    }
//
//    @GetMapping("id/{myID}") //localhost:8080/book/id/111
//    public bookEntry getbookEntryById(@PathVariable Integer myID){
//        return bookEntires.get(myID);
//    }
//    @DeleteMapping ("id/{myID}") //localhost:8080/book/id/111
//    public bookEntry deletebookEntryById(@PathVariable Integer myID){
//        return bookEntires.remove(myID);
//    }
//
//    @PutMapping ("id/{myID}") //localhost:8080/book/id/111
//    public bookEntry putbookEntryById(@PathVariable Integer myID,@RequestBody bookEntry bookentry){
//        return bookEntires.put(myID, bookentry);
//    }