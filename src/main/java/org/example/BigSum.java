package org.example;

import java.util.List;

public class BigSum {
    public static long aVeryBigSum(List<Long> ar) {

        long sum = 0;
        for(long element: ar ){
            sum += element;
        }
        return sum;
    }
}
