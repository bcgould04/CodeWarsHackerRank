package org.example;

import java.util.List;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        List<Integer> ar = List.of(1, 3, 2, 6, 1, 2);
        int n = 6;
        int k = 3;

        System.out.println(divisibleSumPairs(n, k, ar));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        int[] frequency = new int[k];

        for (Integer integer : ar) {
            int mod = integer % k;
            count += frequency[(k - mod) % k]; // Add the count of integer having (k - remainder)%k
            frequency[mod]++; // Increment the frequency of mod of element
        }

        return count;
    }
}


/*
* In the optimized code, we are calculating the remainder of each element when divided by k and storing it in "mod". Then, we check the frequency of integers having value (k - mod)%k in the frequency array as these are the ones that would make the current number form a sum which is multiple of 'k'. We add this frequency to our count. In the end, we are incrementing the frequency of the mod of the current number.
* */