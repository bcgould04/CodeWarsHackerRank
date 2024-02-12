package org.example;

public class SherlockSquares {

    public static int squares(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                count++;
                i += (int) Math.sqrt(i) * 2;
            }
        }
        return count;
    }
}
