package com.example.boi.mela.service;

import com.example.boi.mela.entity.bookEntry;
import com.example.boi.mela.repo.bookRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class bookService {

    @Autowired
    private bookRepo bookrepo; //imported from repo package

    public void saveEntry(bookEntry bookentry){
        bookrepo.save(bookentry); //book repo te database er ORM ache, oitate add hobe bookEntry document er ekta ROW
                                    //row er name bookentry
                                    //bookRepo er sathe connected kora bookEntry DOCUMENT REPO FILE A.
    }

    public List<bookEntry> getAll(){
        return bookrepo.findAll(); // table er sob row niye asho..... class.methode() to call that
                                    // oi table er
    }

    public Optional<bookEntry> findById(ObjectId obj_id){
        return bookrepo.findById(obj_id);
    }
    public Optional<bookEntry> findByTitle(String bookname){
        return bookrepo.findByTitle(bookname);
    }
    public List<bookEntry> findBooksByTitlePattern(String pattern) {
        // Use the regex method to find books
        return bookrepo.findByTitleRegex(pattern);
    }


}
