package org.example;

public class AlphaNumeric {
    public static boolean alphanumeric(String s) {

        return !s.isEmpty() && s.matches("^[a-zA-Z0-9]*$");

    }
}
