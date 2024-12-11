package com.example.boi.mela.service;

import com.example.boi.mela.entity.bookEntry;
import com.example.boi.mela.repo.bookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class bookCollection {

    @Autowired
    private bookRepo bookrepo; //imported from repo package

    public void saveEntry(bookEntry bookentry){
        bookrepo.save(bookentry); //book repo te database er ORM ache, oitate add hobe bookEntry document er ekta ROW
                                    //row er name bookentry
                                    //bookRepo er sathe connected kora bookEntry DOCUMENT REPO FILE A.
    }


}
