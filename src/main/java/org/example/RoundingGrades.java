package org.example;

import java.util.ArrayList;
import java.util.List;

public class RoundingGrades {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();

        for (Integer grade : grades) {
            if (grade >= 38) {
                int remainder = grade % 5;
                if (remainder >= 3) {
                    grade += (5 - remainder);
                }
            }
            roundedGrades.add(grade);
        }

        return roundedGrades;
    }
}
