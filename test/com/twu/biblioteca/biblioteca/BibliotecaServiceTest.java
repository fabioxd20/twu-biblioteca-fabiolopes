package com.twu.biblioteca.biblioteca;

import com.twu.biblioteca.model.Media;
import com.twu.biblioteca.model.MediaType;
import com.twu.biblioteca.service.BibliotecaService;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class BibliotecaServiceTest {
    @Test
    public void testCheckoutMedia() {
        Media mediaToCheckout = new Media(1, "Name", "Author", "2015", MediaType.BOOK);

        assertThat(BibliotecaService.checkout(mediaToCheckout), is(true));
    }
}
