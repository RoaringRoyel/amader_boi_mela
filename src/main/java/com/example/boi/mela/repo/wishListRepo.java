package com.example.boi.mela.repo;

import com.example.boi.mela.entity.userWishList;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface wishListRepo extends MongoRepository<userWishList,String> {
}
