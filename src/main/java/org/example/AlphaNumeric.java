package org.example;

public class AlphaNumeric {
    public static boolean alphanumeric(String s){

        /*if (s.isEmpty()) {
            return false;
        }

        String pattern= "^[a-zA-Z0-9]*$"*/;
        return !s.isEmpty() && s.matches("^[a-zA-Z0-9]*$");


    }
}
