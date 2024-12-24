package com.example.boi.mela.controller;

import com.example.boi.mela.entity.bookEntry;
import com.example.boi.mela.service.bookService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://127.0.0.1:5500", allowCredentials = "true")
@Component
@RestController
public class serchController {

    @Autowired
    private bookService booksearch;

//
//    @GetMapping("search/{title}") //localhost:8080/book/id/111
//    public Optional<bookEntry> getBookDeatils(@PathVariable String title){
//        return bookService.findBooksByTitlePattern(keyword);
//        //return booksearch.findByTitle(title);
////        return bookEntires.get(myID);
//    }
    @GetMapping("search/{key}") //localhost:8080/book/id/111
    public List<bookEntry> getBookSearch(@PathVariable String key){
        return booksearch.findBooksByTitlePattern(key);
//        return booksearch.findByTitle(title);
//        return bookEntires.get(myID);
    }

//    @PostMapping("/add_cart/{book_title}")
//    public void addToCart(@PathVariable String book_title, HttpSession session){
//        new List<CartArray>
//    }
// Define a class-level constant for the session attribute name
    private static final String CART_SESSION_KEY = "cart";

    @PostMapping("/add_cart/{book_title}")
    public String addToCart(@PathVariable String book_title, HttpSession session) {
        // Retrieve the cart from the session or initialize it if it doesn't exist
        List<String> cart = (List<String>) session.getAttribute(CART_SESSION_KEY);

        if (cart == null) {
            cart = new ArrayList<>();
            session.setAttribute(CART_SESSION_KEY, cart); // Save the new cart to the session
        }

        // Add the book to the cart
        cart.add(book_title);
        System.out.println("Session ID: " + session.getId());
        System.out.println("Cart contents after adding: " + cart);
        return "Hi ROYEL _ Book added to cart: " + book_title;
    }

    @GetMapping("/view_cart")
    public List<String> viewCart(HttpSession session) {
        // Retrieve the cart from the session
        List<String> cart = (List<String>) session.getAttribute(CART_SESSION_KEY);

        // Return the cart or an empty list if it doesn't exist
        return cart != null ? cart : new ArrayList<>();
    }

    @PostMapping("/clear_cart")
    public String clearCart(HttpSession session) {
        // Remove the cart from the session
        session.removeAttribute(CART_SESSION_KEY);
        return "Cart cleared!";
    }
}
