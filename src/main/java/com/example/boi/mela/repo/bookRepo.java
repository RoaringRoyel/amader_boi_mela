package com.example.boi.mela.repo;
import com.example.boi.mela.entity.bookEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface bookRepo extends MongoRepository<bookEntry,Integer> {
                                                //Document + Primary Key Data Type
}
