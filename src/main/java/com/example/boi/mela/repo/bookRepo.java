package com.example.boi.mela.repo;
import com.example.boi.mela.entity.bookEntry;
import com.example.boi.mela.entity.userEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface bookRepo extends MongoRepository<bookEntry, ObjectId> {
    //Document + Primary Key Data Type
    Optional<bookEntry> findByTitle(String title);
    // Fetch books with titles matching the pattern
    @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
    List<bookEntry> findByTitleRegex(String regex);
}
