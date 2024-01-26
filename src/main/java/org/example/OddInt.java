package org.example;

/*
* Given an array of integers, find the one that appears an odd number of times.
    There will always be only one integer that appears an odd number of times.
* */
public class OddInt {
    public class Main {


        static int oddOccurrences(int[] arr) {
            int result = 0;
            for (int element : arr) {
                result = result ^ element;
            }
            return result;
        }
    }
}

/*
* result = result ^ element; is using the XOR operator (^).
The XOR operator has two useful properties for this problem:
A XOR A = 0
A XOR 0 = A
So, if a number occurs an even number of times in the array, it gets XORed with itself that many times, which will always be 0 due to the first property.
All these even occurrences elements will eventually XOR to give 0. And, the number occurring an odd number of times gets XORed with 0 (the initial value of result), which will simply give the number itself due to the second property.
As a result, the result variable ends up storing the integer that appears an odd number of times in the array.
* */