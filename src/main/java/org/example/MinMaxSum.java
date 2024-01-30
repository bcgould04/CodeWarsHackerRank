package org.example;

import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        long sum = 0;
        long minVal = Long.MAX_VALUE;
        long maxVal = Long.MIN_VALUE;

        for (int val : arr) {
            sum += val;
            minVal = Math.min(minVal, val);
            maxVal = Math.max(maxVal, val);
        }

        long minSum = sum - maxVal;
        long maxSum = sum - minVal;

        System.out.println(minSum + " " + maxSum);
    }
}
