package com.twu.biblioteca.service;

import com.twu.biblioteca.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BibliotecaService {

    private List<Media> availableMedias;
    private List<Book> books;
    private List<Movie> movies;

    public BibliotecaService() {
        loadMedias();
    }

    public void loadMedias() {
        this.books = new LinkedList<Book>(Arrays.asList(
                new Book(1,"Book One","Author One","2001"),
                new Book(2,"Book Two","Author Two","2002")
        ));

        this.movies = new LinkedList<Movie>(Arrays.asList(
                new Movie(1,"Movie One","2001","Director One", 10),
                new Movie(2,"Movie Two","2002","Director Two", 8)
        ));

        this.availableMedias = new LinkedList<Media>();

        this.availableMedias.addAll(books);
        this.availableMedias.addAll(movies);
    }

    public List<Book> getBooksCatalog() {
        return this.books;
    }

    public List<Movie> getMoviesCatalog() {
        return this.movies;
    }

    public List<Media> getBooksAvailableToCheckout() {
        List<Media> list = new ArrayList<>();
        for (Media media : availableMedias) {
            if (media instanceof Book) {
                list.add(media);
            }
        }
        return list;
    }

    public List<Media> getMoviesAvailableToCheckout() {
        List<Media> list = new ArrayList<>();
        for (Media media : availableMedias) {
            if (media instanceof Movie) {
                list.add(media);
            }
        }
        return list;
    }

    public boolean checkout(Media pMedia) {
        if (pMedia == null) return false;

        Media mediaFiltered = this.availableMedias
                .stream()
                .filter(media -> pMedia.getId() == media.getId() && pMedia.getClass() == media.getClass())
                .findFirst()
                .orElse(null);

        if (mediaFiltered == null) return false;

        return this.availableMedias.remove(mediaFiltered);
    }

    public Book getBook(long bookId) {
        return this.books.stream().filter(book -> bookId == book.getId()).findFirst().orElse(null);
    }

    public Movie getMovie(long movieId) {
         return this.movies.stream().filter(movie -> movieId == movie.getId()).findFirst().orElse(null);
    }

    public boolean giveBack(Media pMedia) {
        Media mediaFiltered = this.availableMedias
                .stream()
                .filter(media -> pMedia.getId() == media.getId() && pMedia.getClass() == media.getClass())
                .findFirst()
                .orElse(null);


        if (mediaFiltered == null) {
            return this.availableMedias.add(mediaFiltered);
        }

        return false;
    }
}
