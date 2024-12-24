package com.example.boi.mela.entity;

import org.springframework.data.annotation.Id;

import java.util.List;

public class userWishList {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getWishlist() {
        return wishlist;
    }

    public void setWishlist(List<String> wishlist) {
        this.wishlist = wishlist;
    }
    @Id
    private String username;
    private List<String> wishlist;
}
