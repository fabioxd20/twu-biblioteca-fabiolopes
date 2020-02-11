package com.twu.biblioteca.service;

import com.twu.biblioteca.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BibliotecaService {

    private Catalog catalog;
    private List<Media> availableMedias;

    public BibliotecaService(Book[] pBooks, Movie[] pMovies) {
        List<Book> books = new LinkedList<Book>(Arrays.asList(pBooks));
        List<Movie> movies = new LinkedList<Movie>(Arrays.asList(pMovies));

        this.catalog = new Catalog(books, movies);

        availableMedias = new LinkedList<Media>();

        availableMedias.addAll(books);
        availableMedias.addAll(movies);
    }

    public List<Book> getBooksCatalog() {
        return this.catalog.getBooks();
    }

    public List<Movie> getMoviesCatalog() {
        return this.catalog.getMovies();
    }

    public List<Media> getMediasAvailableToCheckout(MediaType type) {
        List<Media> list = new ArrayList<>();
        for (Media media : availableMedias) {
            if (media.getType() == type) {
                list.add(media);
            }
        }
        return list;
    }

    public boolean checkout(Media pMedia) {
        Media mediaFiltered = this.availableMedias
                .stream()
                .filter(media -> pMedia.getId() == media.getId() && pMedia.getType() == media.getType())
                .findFirst()
                .orElse(null);

        if (mediaFiltered == null) {
            return false;
        }

        return this.availableMedias.remove(mediaFiltered);
    }

    public Book getBookInCatalog(long bookId) {
        return this.catalog.getBooks().stream().filter(book -> bookId == book.getId()).findFirst().orElse(null);
    }

    public Movie getMovieInCatalog(long movieId) {
        return this.catalog.getMovies().stream().filter(movie -> movieId == movie.getId()).findFirst().orElse(null);
    }

    public boolean giveBack(Media pMedia) {
        Media mediaFiltered = this.availableMedias
                .stream()
                .filter(media -> pMedia.getId() == media.getId() && pMedia.getType() == media.getType())
                .findFirst()
                .orElse(null);

        if (mediaFiltered == null) {
            return this.availableMedias.add(mediaFiltered);
        }

        return false;
    }
}
