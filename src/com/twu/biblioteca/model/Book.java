package com.twu.biblioteca.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Book extends Media {

    public Book(long id, String name, String author, String year) {
        super(id, name, author, year);
    }

    @Override
    public String toString() {
        return this.getName() + "|" +this.getAuthor() + "|" + this.getYear() + "|" + this.getId();
    }
}
