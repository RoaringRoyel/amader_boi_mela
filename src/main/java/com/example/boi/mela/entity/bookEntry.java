package com.example.boi.mela.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document(collection = "book_entries")
public class bookEntry {
    @Id
    private Integer id;

    private String title;

    private String writter;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWritter() {
        return writter;
    }

    public void setWritter(String writter) {
        this.writter = writter;
    }
}
