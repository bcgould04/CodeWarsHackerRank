package org.example;

/*
This task can be accomplished by splitting the input string on either dashes or underscores, iterating over the resulting array, and capitalizing every word from the second one onwards. Here is a Java solution using this approach.
 */
public class CamelCase {
    static String toCamelCase(String s) {
        String[] parts = s.split("-|_");

        StringBuilder camelCaseString = new StringBuilder(parts[0]);   // First word as is

        for (int i = 1; i < parts.length; i++) {
            camelCaseString.append(toProperCase(parts[i]));   // capitalize next words
        }
        return camelCaseString.toString();
    }

    static String toProperCase(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
}
