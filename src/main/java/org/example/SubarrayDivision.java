package org.example;

import java.util.List;

public class SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {

        int count = 0;
        int sum = 0;

        // Loop for the first 'm' elements
        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }

        // Check the sum of the first 'm' elements
        if (sum == d) {
            count++;
        }

        // Slide over the array, continuously determine the sum
        for (int i = m; i < s.size(); i++) {
            // Subtract the first element of current window and add the new element to maintain sum of 'm' elements
            sum = sum - s.get(i - m) + s.get(i);

            if (sum == d) {
                count++;
            }
        }

        return count;

    }
}
