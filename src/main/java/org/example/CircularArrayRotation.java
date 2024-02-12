package org.example;

import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {

        // Calculate effective rotations
        int rotation = k % a.size();

        // Create a new list with rotated values
        List<Integer> rotatedList = new ArrayList<>();
        rotatedList.addAll(a.subList(a.size() - rotation, a.size()));
        rotatedList.addAll(a.subList(0, a.size() - rotation));

        // Create a list for result
        List<Integer> result = new ArrayList<>();
        for (int index : queries) {
            result.add(rotatedList.get(index));
        }

        return result;
    }
}


/*
* The time complexity of this function is O(n + q), where n is the size of the given list and q is the size of the queries list. This represents the worst-case scenario, where you have to process every element of the 'a' list and every query in the 'queries' list.
* */