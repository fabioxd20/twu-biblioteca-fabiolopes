package com.twu.biblioteca.service;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.model.User;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UserService {

    private static List<User> users = new LinkedList<User>(Arrays.asList(
            new User("123-1234", "1234")
    ));

    public static boolean login(User userToLogin) {
        User user = findUser(userToLogin);
        if (user != null && user.getPassword().equals(userToLogin.getPassword())) {
            return  true;
        } else {
            return false;
        }
    }

    private static User findUser(User userToLogin) {
        return users.stream().filter(user -> userToLogin.getLogin().equals(user.getLogin())).findFirst().orElse(null);
    }
}
