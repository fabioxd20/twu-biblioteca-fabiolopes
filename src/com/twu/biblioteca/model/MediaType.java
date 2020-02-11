package com.twu.biblioteca.model;

public enum MediaType {

    BOOK(1), MOVIE(2);

    public final int type;

    MediaType(int type) {
        this.type = type;
    }

}
