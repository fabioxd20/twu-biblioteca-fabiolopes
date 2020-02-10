package com.twu.biblioteca.view;

public class UserView {
    public static String getLoginMessage() { return "Please insert your library number:"; }

    public static String getPasswordMessage() {return "Please insert your password:";}

    public static String getLoginFailMessage() {
        return "Wrong credentials";
    }

    public static String getLoginSuccessMessage() {
        return "Right credentials";
    }
}
