package com.twu.biblioteca.biblioteca;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Media;
import com.twu.biblioteca.model.MediaType;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.service.BibliotecaService;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BibliotecaServiceTest {

    private BibliotecaService bibliotecaService;

    @Before
    public void init() {
        Book[] books = {
                new Book(1,"Book One","Author One","2001"),
                new Book(2,"Book Two","Author Two","2002")
        };

        Movie[] movies = {
                new Movie(1,"Movie One","2001","Director One", 10),
                new Movie(2,"Movie Two","2002","Director Two", 8)
        };

        this.bibliotecaService = new BibliotecaService(books, movies);
    }

    @Test
    public void testLoadBooksCatalog() {
        List<Book> booksCatalog = this.bibliotecaService.getBooksCatalog();

        assertThat(booksCatalog, is(not(booksCatalog.isEmpty())));
    }

    @Test
    public void testLoadMoviesCatalog() {
        List<Movie> moviesCatalog = this.bibliotecaService.getMoviesCatalog();

        assertThat(moviesCatalog, is(not(moviesCatalog.isEmpty())));
    }

    @Test
    public void testListBooksAvailable() {
        Book[] books = {
                new Book(1,"Book One","Author One","2001"),
                new Book(2,"Book Two","Author Two","2002")
        };

        List<Media> booksAvailableToCheckout = this.bibliotecaService.getMediasAvailableToCheckout(MediaType.BOOK);

        assertThat(booksAvailableToCheckout, is(not(booksAvailableToCheckout.isEmpty())));
    }

    @Test
    public void testCheckoutMediaAvailable() {
        Book book = new Book(1,"Book One","Author One","2001");

        assertThat(this.bibliotecaService.checkout(book), is(true));
    }

    @Test
    public void testCheckoutMediaUnavailable() {
        Book book = new Book(1,"Book One","Author One","2001");

        this.bibliotecaService.checkout(book);

        assertThat(this.bibliotecaService.checkout(book), is(false));
    }

    @Test
    public void testGetBookInCatalog() {
        long bookId = 1;

        Book book = this.bibliotecaService.getBookInCatalog(bookId);

        assertThat(book.getId(), is(bookId));
    }

    @Test
    public void testGetMovieInCatalog() {
        long movieId = 1;

        Movie movie = this.bibliotecaService.getMovieInCatalog(movieId);

        assertThat(movie.getId(), is(movieId));
    }

    @Test
    public void testGiveBackMedia() {
        Book book = new Book(1,"Book One","Author One","2001");

        this.bibliotecaService.checkout(book);

        assertThat(this.bibliotecaService.giveBack(book), is(true));
    }

    @Test
    public void testGiveBackMediaAlreadyInList() {
        Book book = new Book(1,"Book One","Author One","2001");

        assertThat(this.bibliotecaService.giveBack(book), is(false));
    }
}
