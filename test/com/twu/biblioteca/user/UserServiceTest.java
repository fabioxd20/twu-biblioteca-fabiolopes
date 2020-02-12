package com.twu.biblioteca.user;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.service.UserService;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserServiceTest {
    private UserService userService;
    @Before
    public void init() {
        this.userService = new UserService();
    }

    @Test
    public void shouldReturnTrueIfUserIsLogged() {
        User user = new User("123-1234", "1234");

        this.userService.login(user);

        assertThat(this.userService.isLogged(), is(true));
    }

    @Test
    public void shouldReturnFalseIfUserNotIsLogged() {
        assertThat(this.userService.isLogged(), is(false));
    }
}
