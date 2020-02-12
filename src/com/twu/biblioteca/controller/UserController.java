package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.service.UserService;

import java.util.Scanner;

public class UserController {

    private static UserService userService = new UserService();

    public static boolean login(String login, String password) {
        User user = new User(login, password);

        return userService.login(user);
    }

    public static String reciveCredentialsUser() {
        Scanner scanner = new Scanner(System.in);
        return  scanner.next();
    }

    public static void requestLogin() {
        System.out.println("Insert your library number:");
        String login = reciveCredentialsUser();
        System.out.println("Insert you password:");
        String password = reciveCredentialsUser();

        if (login(login, password)) {
            System.out.println("Well done.");
        } else {
            System.out.println("Fail try again.");
        }
    }

    public static boolean isLogged() {
        return userService.isLogged();
    }

    public static void showUserLogged() {
        System.out.println(userService.getUserLogged());
    }

}
