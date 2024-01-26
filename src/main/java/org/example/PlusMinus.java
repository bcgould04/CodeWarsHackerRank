package org.example;

import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int size = arr.size();
        for (Integer integer : arr) {
            if (integer > 0) {
                positive++;
            } else if (integer < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        double positiveResult =  ((double) positive / size);
        double negativeResult = ((double) negative / size);
        double zeroResult = ((double) zero / size);

        System.out.printf("%.6f\n", positiveResult);
        System.out.printf("%.6f\n", negativeResult);
        System.out.printf("%.6f\n", zeroResult);


    }
}
