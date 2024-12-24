package com.example.boi.mela.service;

import com.example.boi.mela.entity.CustomerInfo;
//import com.example.boi.mela.entity.CustomerReview;
import com.example.boi.mela.repo.CustomerInfoRepo;
//import com.example.boi.mela.repo.reviewRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerInfoCollection {
    @Autowired
    private CustomerInfoRepo customerInforepo;

    public void saveReview(CustomerInfo customerInfo) {
        customerInforepo.save(customerInfo);
    }

    public List<CustomerInfo> getAll() { return customerInforepo.findAll();}
    public Optional<CustomerInfo> findById(ObjectId obj_id){
        return customerInforepo.findById(obj_id);
    }

    public void saveInfo(CustomerInfo info) {
    }
}
