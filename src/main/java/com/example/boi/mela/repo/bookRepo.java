package com.example.boi.mela.repo;
import com.example.boi.mela.entity.bookEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface bookRepo extends MongoRepository<bookEntry, ObjectId> {
                                                //Document + Primary Key Data Type
}
