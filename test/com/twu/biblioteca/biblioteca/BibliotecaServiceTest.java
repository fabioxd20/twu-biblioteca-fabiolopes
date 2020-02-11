package com.twu.biblioteca.biblioteca;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Media;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.service.BibliotecaService;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BibliotecaServiceTest {
    @Test
    public void testLoadBooksCatalog() {
        Book[] books = {
                new Book(1,"Book One","Author One","2001"),
                new Book(2,"Book Two","Author Two","2002")
        };

        BibliotecaService.loadBooks(books);

        List<Book> booksCatalog = BibliotecaService.getBooksCatalog();

        assertThat(booksCatalog, is(not(booksCatalog.isEmpty())));
    }

    @Test
    public void testLoadMoviesCatalog() {
        Movie[] movies = {
                new Movie(1,"Movie One","2001","Director One", 10),
                new Movie(2,"Movie Two","2002","Director Two", 8)
        };

        BibliotecaService.loadMovies(movies);

        List<Movie> moviesCatalog = BibliotecaService.getMoviesCatalog();

        assertThat(moviesCatalog, is(not(moviesCatalog.isEmpty())));
    }

}
