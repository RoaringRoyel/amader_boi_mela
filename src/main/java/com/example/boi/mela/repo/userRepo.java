package com.example.boi.mela.repo;

import com.example.boi.mela.entity.bookEntry;
import com.example.boi.mela.entity.userEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepo extends MongoRepository<userEntry, ObjectId> {
    userEntry findByUsername(String username);
}
