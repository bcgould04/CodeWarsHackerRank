/*
There will be two arrays of integers. Determine all integers that satisfy the following two conditions:

The elements of the first array are all factors of the integer being considered
The integer being considered is a factor of all elements of the second array
These numbers are referred to as being between the two arrays. Determine how many such numbers exist.
*/

package org.example;

import java.util.List;
import java.util.stream.IntStream;

public class TwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int lcmOfA = a.get(0);
        for (Integer integer : a) {
            lcmOfA = lcm(lcmOfA, integer);
        }

        int gcdOfB = b.get(0);
        for (Integer integer : b) {
            gcdOfB = gcd(gcdOfB, integer);
        }

        int counter = 0;
        for (int i = lcmOfA, j = 2; i <= gcdOfB; i = lcmOfA * j, j++) {
            if (gcdOfB % i == 0) {
                counter++;
            }
        }

        return counter;
    }

    /* This is a helper function to calculate the Greatest Common Divisor (GCD) of two numbers using the Euclidean algorithm. It's a recursive function that uses the modulo operation to find divisors.*/
    public static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    /* Calculates the Least Common Multiple (LCM) of two numbers. Given that the equation for the LCM of two numbers a and b is (a*b)/gcd(a, b), it uses our GCD helper function to do that.*/
    public static int lcm(int a, int b) {
        int gcd = gcd(a, b);
        // Perform division before multiplication to prevent potential overflow.
        return (a / gcd) * b;
    }
}
