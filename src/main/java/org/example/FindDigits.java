package org.example;

import java.util.ArrayList;
import java.util.List;

public class FindDigits {

    public static int findDigits(int n) {
       int divisors = 0;

        /*
        String[] digits = String.valueOf(n).split("");
        for (String digit : digits) {
            int d = Integer.parseInt(digit);
            if (d != 0 && n % d == 0) {
                divisors++;
            }
        }*/

        int originalN = n;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && originalN % digit == 0) {
                divisors++;
            }
            n /= 10;
        }
        return divisors;
    }

}
