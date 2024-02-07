package org.example;

import java.util.List;

public class AngryProfessor {

    public static String angryProfessor(int k, List<Integer> a) {
        int onTime = 0;
        for (Integer integer : a) {
            if (integer <= 0) {
                onTime++;
            }
        }
        return onTime >= k ? "NO" : "YES";

    }
}
