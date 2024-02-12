package org.example;

import java.util.ArrayList;
import java.util.List;

public class SequenceEquation {

    public static List<Integer> permutationEquation(List<Integer> p) {
        int n = p.size();
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> positions = new ArrayList<Integer>(n + 1);

        // Initialize positions list.
        for (int i = 0; i <= n; i++) {
            positions.add(0);
        }

        // Store positions.
        for (int i = 0; i < n; i++) {
            positions.set(p.get(i), i + 1);
        }

        // Find integer y.
        for (int i = 1; i <= n; i++) {
            result.add(positions.get(positions.get(i)));
        }

        return result;

    }

}
