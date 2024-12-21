package com.example.boi.mela.service;

import com.example.boi.mela.entity.userEntry;
import com.example.boi.mela.repo.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class userService {
    @Autowired
    private userRepo userrepo;

    public userEntry findByUsername(String username){
        return userrepo.findByUsername(username);
    }

    public boolean validateUser(String username, String password){
        userEntry user = userrepo.findByUsername(username);
        return user != null && user.getPassword().equals(password);

    }

    public boolean saveEntry(userEntry user){
        System.out.println("Saving user: " + user);
        userrepo.save(user);
        System.out.println("User saved successfully.");
        return true;
    }
}
