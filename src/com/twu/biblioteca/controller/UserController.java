package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.service.UserService;

import java.util.Scanner;

public class UserController {

    public static boolean login(String login, String password) {
        User user = new User(login, password);

        UserService userService = new UserService();

        return userService.login(user);
    }

    public static String reciveCredentialsUser() {
        Scanner scanner = new Scanner(System.in);
        return  scanner.next();
    }

}
