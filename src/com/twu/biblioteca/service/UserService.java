package com.twu.biblioteca.service;

import com.twu.biblioteca.model.User;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UserService {

    private User userLogged = null;

    private List<User> users = new LinkedList<User>(Arrays.asList(
            new User("123-1234", "1234", "Fabio", "fabioxd.20@gmail.com", "81 984543277")
    ));

    public boolean login(User userToLogin) {
        User user = findUser(userToLogin);
        if (user != null && user.getPassword().equals(userToLogin.getPassword())) {
            this.userLogged = user;
            return  true;
        } else {
            return false;
        }
    }

    private User findUser(User userToLogin) {
        return users.stream().filter(user -> userToLogin.getLogin().equals(user.getLogin())).findFirst().orElse(null);
    }

    public boolean isLogged() {
        if(this.userLogged == null) {
            return  false;
        }

        return true;
    }

    public User getUserLogged() {
        return this.userLogged;
    }
}
