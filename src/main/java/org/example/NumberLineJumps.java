package org.example;

public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {

        if(x2 > x1 && v2 > v1) {
            return "NO";
        }

        if(x1 + v1 == x2 + v2) {
            return "YES";
        }



        return "NO";

    }
}
