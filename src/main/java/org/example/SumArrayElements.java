package org.example;

import java.util.List;

public class SumArrayElements {

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for(int element: ar ){
            sum += element;
        }
        return sum;

    }

}
