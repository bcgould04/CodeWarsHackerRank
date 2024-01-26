package org.example;

import java.util.PriorityQueue;

public class SortOdd {
    public static int[] sortArray(int[] array) {
        // Filter out the odd numbers and sort them
        PriorityQueue<Integer>  oddNumbersQueue = new PriorityQueue<>();
        for (int num : array) {
            if (num % 2 != 0) {
                oddNumbersQueue.offer(num);
            }
        }

        // Construct final result
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[i] = array[i];
            } else {
                result[i] = oddNumbersQueue.poll();
            }
        }
        return result;
    }
}

/*
* In this code, a priority queue oddNumbersQueue is used to automatically sort the odd numbers in ascending order. The oddNumbersQueue.offer(num) statement inserts odd numbers into the queue.
When constructing the final result, if the number in the original array was even, it remains the same. If it was odd, it's replaced with the smallest remaining odd number (oddNumbersQueue.poll();).
*
* */