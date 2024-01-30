package org.example;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int level = 0; // Current level
        int valleys = 0; // Number of valleys

        for (char step: path.toCharArray()) {
            // If we are going up
            if (step == 'U') {
                level++;

                // If we just came up to sea level
                if (level == 0) {
                    valleys++;
                }
            } else {
                level--;
            }
        }

        return valleys;


    }
}
