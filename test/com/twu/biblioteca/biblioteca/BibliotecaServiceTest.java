package com.twu.biblioteca.biblioteca;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Media;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.service.BibliotecaService;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BibliotecaServiceTest {

    private BibliotecaService bibliotecaService;

    @Before
    public void init() {
        this.bibliotecaService = new BibliotecaService();
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
    public void testListBooksAvailableToCheckout() {
        List<Media> booksAvailableToCheckout = this.bibliotecaService.getBooksAvailableToCheckout();

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
    public void testCheckoutMediaDontExist() {
        Book book = null;

        this.bibliotecaService.checkout(book);

        assertThat(this.bibliotecaService.checkout(book), is(false));
    }

    @Test
    public void testGetBookInCatalog() {
        long bookId = 1;

        Book book = this.bibliotecaService.getBook(bookId);

        assertThat(book.getId(), is(bookId));
    }
    @Test
    public void testGetBookWhenIdNotExist() {
        long bookId = 99;

        Book book = this.bibliotecaService.getBook(bookId);

        assertThat(book, is(nullValue()));
    }

    @Test
    public void testGetMovieInCatalog() {
        long movieId = 1;

        Movie movie = this.bibliotecaService.getMovie(movieId);

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
