package org.example;

import java.util.List;

public class MigratoryBirds {

    public static void main(String[] args) {
        System.out.println(migratoryBirds(List.of(1, 4, 4, 4, 5, 3)));
    }
    public static int migratoryBirds(List<Integer> arr) {

        int[] birdCounts = new int[6];
        for (int num : arr) {
            birdCounts[num]++;
        }

        int maxCountIndex = 1;
        for (int i = 0; i < birdCounts.length; i++) {
            if (birdCounts[i] > birdCounts[maxCountIndex]) {
                maxCountIndex = i;
            }
        }
        return maxCountIndex;

    }
}
/*
* firstly initializes an array of size 6, because the problem statement states that each bird has a type, and types are labeled 1 through 5. Then it increments the relevant index for each bird spotted.
Finally, it iterates over the birdCounts array from the start and checks if the count of the current bird type is larger than the bird type currently noted as having the highest count. Since we are iterating from start to finish, the bird type with the smallest id (in case of a tie in the counts) will be preferentially selected. This meets the requirement to return the bird type with the smallest id when there is a tie in the counts. Note that we start maxCountIndex from 1, because bird type labels start from 1.
* */