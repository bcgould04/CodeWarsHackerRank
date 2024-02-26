package org.example;

import java.util.ArrayList;
import java.util.List;

public class FindDigits {

    public static int findDigits(int n) {

       int divisors = 0;
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
