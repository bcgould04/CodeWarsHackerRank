package org.example;

import java.util.List;

public class LongestSubArray {

    public static void main(String[] args) {
        List<Integer> a = List.of(1,1,2,2,4,4,5,5,5);
        System.out.println("Here: " + pickingNumbers(a));
    }

    public static int pickingNumbers(List<Integer> a) {
        int[] freq = new int[100];
        for (int num : a) {
            freq[num]++;
        }

        int max = 0;
        for (int i = 0; i < freq.length - 1; i++) {
            max = Math.max(max, freq[i] + freq[i+1]);
        }
        return max;

    }

}
