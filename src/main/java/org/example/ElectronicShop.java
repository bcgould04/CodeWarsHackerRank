package org.example;

import java.util.Arrays;

/* a variant of the Knapsack Problem */
public class ElectronicShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        // Sort both arrays
        Arrays.sort(keyboards);
        Arrays.sort(drives);

        // Initialize maximum spend to -1 to handle case where no pair is within budget
        int max = -1;

        // Use two pointers - one starting from the beginning of the keyboards array and the other from the end of the drives array
        int i = 0; // for keyboards
        int j = drives.length - 1; // for drives

        // While pointers haven't crossed each other
        while(i < keyboards.length && j >= 0) {
            int sum = keyboards[i] + drives[j];

            if(sum > b) {
                // If sum exceeds budget move to cheaper drive
                j--;
            } else {
                // If sum is within budget, move to more expensive keyboard
                max = Math.max(max, sum);
                i++;
            }
        }

        return max;

    }

}

/* overall time complexity of O(n log n) */