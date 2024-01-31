package org.example;

import java.util.List;

public class MagicSquare {
    public static int formingMagicSquare(List<List<Integer>> s) {
        int[][][] possiblePermutations = {
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},// 1

                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},// 2

                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},// 3

                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},// 4

                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},// 5

                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},// 6

                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},// 7

                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},// 8
        };

        int min_cost = Integer.MAX_VALUE;
        for (int permutation = 0; permutation < 8; permutation++) {
            int permutationCost = getPermutationCost(s, possiblePermutations[permutation]);
            min_cost = Math.min(min_cost, permutationCost);
        }
        return min_cost;
    }

        private static int getPermutationCost(List<List<Integer>> s, int[][] permutation) {
            int totalCost = 0;
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 3; ++j) {
                    totalCost += Math.abs(s.get(i).get(j) - permutation[i][j]);
                }
            }
            return totalCost;
        }

}

/*
* The totalCost is initially 0. Then, for each row i and each column j, we add the absolute difference between the i,jth value in s and the i,jth value in permutation to totalCost.
*
* At the end of these iterations, totalCost will contain the sum of the absolute differences between the elements in s and the corresponding elements in permutation which represents the cost to convert the input square s into the magic square permutation.
* */