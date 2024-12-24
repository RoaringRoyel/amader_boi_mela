package com.example.boi.mela.repo;
import com.example.boi.mela.entity.CustomerInfo;
//import com.example.boi.mela.entity.CustomerReview;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerInfoRepo extends MongoRepository<CustomerInfo, ObjectId> {

}
//Document + Primary Key Data Type
