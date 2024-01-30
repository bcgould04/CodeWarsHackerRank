package org.example;

import java.util.List;

public class BreakingRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {

        long minScore = scores.get(0);
        long maxScore = scores.get(0);
        int minCount = 0;
        int maxCount = 0;

        for (int val : scores) {
            if (val < minScore) {
                minScore = val;
                minCount++;
            } else if (val > maxScore) {
                maxScore = val;
                maxCount++;
            }
        }

        return List.of(maxCount, minCount);
    }
}
