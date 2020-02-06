package com.twu.biblioteca;


import com.twu.biblioteca.view.BibliotecaView;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BibliotecaTest {

    @Test
    public void testShowWelcomeMessage() {
        String welcomeMessage = "Welcome to Biblioteca your one-stop-shop for great book titles in Bangalore!";

        BibliotecaView bibliotecaView = new BibliotecaView();

        assertThat(bibliotecaView.showWelcomeMessage(), is(welcomeMessage));
    }
}
