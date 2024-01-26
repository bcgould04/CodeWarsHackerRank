package org.example;

import java.util.Arrays;
import java.util.List;

public class Triplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alicePoints = 0;
        int bobPoints = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alicePoints++;
            } else if (b.get(i) > a.get(i)) {
                bobPoints++;
            }
        }

        return Arrays.asList(alicePoints, bobPoints);

    }
}
