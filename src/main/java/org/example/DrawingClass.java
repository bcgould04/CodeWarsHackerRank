package org.example;

public class DrawingClass {

    public static void main(String[] args) {
        System.out.println(pageCount(4, 5));
    }
    public static int pageCount(int n, int p) {
        //  n pages long
        //  p page a student wants to turn to

        int from_start = p / 2;

        // Calculate from end
        // We have two cases here one where the total is odd (like 5 and you want to reach to 4)
        // and the other is when the total number is even
        int from_end = (n % 2 == 0) ? (n - p + 1) / 2 : (n - p) / 2;

        return Math.min(from_start, from_end);
    }
}
