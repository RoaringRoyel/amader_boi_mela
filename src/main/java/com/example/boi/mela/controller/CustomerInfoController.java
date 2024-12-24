package com.example.boi.mela.controller;

import com.example.boi.mela.entity.CustomerInfo;
//import com.example.boi.mela.entity.CustomerReview; //
import com.example.boi.mela.entity.bookEntry;
import com.example.boi.mela.service.CustomerInfoCollection;
//import com.example.boi.mela.service.reviewCollection;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping
public class CustomerInfoController {
    @Autowired
    private CustomerInfoCollection CustomerInfoCollection;

    @GetMapping("/getInfo/22101649")
    public List<CustomerInfo> getAll(){ // kon type a back dibe ? List<DOCUMENT>
        return CustomerInfoCollection.getAll();


    }


    @PostMapping("/postInfo/22101649")
    public boolean createInfo(@RequestBody CustomerInfo Info) {
        Info.setDate(LocalDateTime.now());
        CustomerInfoCollection.saveInfo(Info);
        return true;
    }

}