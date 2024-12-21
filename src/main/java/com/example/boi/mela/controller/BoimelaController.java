package com.example.boi.mela.controller;

import com.example.boi.mela.entity.bookEntry; //
import com.example.boi.mela.service.bookService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BoimelaController {
    @Autowired
    private bookService bookcollection; //service part

    @GetMapping
    public List<bookEntry> getAll(){ // kon type a back dibe ? List<DOCUMENT>
        return bookcollection.getAll();
    }

    @GetMapping("id/{my_id}")
    public bookEntry findById(@PathVariable ObjectId my_id){
        return bookcollection.findById(my_id).orElse(null);
    }


    @PostMapping //localhost:8080/book
    public boolean createEntry(@RequestBody bookEntry bookentry){ //which table /document's data ?
        bookentry.setDate(LocalDateTime.now()); //setting the date
        bookcollection.saveEntry(bookentry); //calling the service to entry the Data
        return true;
    }

}

//    @PutMapping ("id/{my_ID}") //localhost:8080/book/id/111
//    public bookEntry putbookEntryById(@PathVariable ObjectId my_ID,@RequestBody bookEntry bookentry){
//
//        return bookcollection.saveEntry(my_ID, bookentry);
//    }

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