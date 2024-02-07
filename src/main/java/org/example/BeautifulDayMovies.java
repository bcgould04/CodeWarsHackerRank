package org.example;

public class BeautifulDayMovies {

    public static int beautifulDays(int i, int j, int k) {
        int beautifulDays = 0;
        while (i <= j) {
            int reversed = Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString());
            if ((i - reversed) % k == 0) {
                beautifulDays++;
            }
            i++;
        }

        return beautifulDays;

    }
}
