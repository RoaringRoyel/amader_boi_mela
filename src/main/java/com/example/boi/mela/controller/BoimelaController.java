package com.example.boi.mela.controller;

import com.example.boi.mela.entity.bookEntry; //
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/book")
public class BoimelaController {
    private Map<Integer, bookEntry> bookEntires = new HashMap<>();

    @GetMapping
    public List<bookEntry> getAll(){
        return new ArrayList<>(bookEntires.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody bookEntry bookentry){
        bookEntires.put(bookentry.getId(), bookentry);
        return true;
    }


}
