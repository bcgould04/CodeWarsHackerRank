package org.example;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumPrimaryDiagonal = 0;
        int sumSecondaryDiagonal = 0;

        for(int i = 0; i < arr.size(); i++) {
            sumPrimaryDiagonal += arr.get(i).get(i);
            sumSecondaryDiagonal += arr.get(i).get(arr.size() - 1 - i);
        }

        return Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal);

    }
}
