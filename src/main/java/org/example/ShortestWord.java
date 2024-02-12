package org.example;

public class ShortestWord {

    public static int findShort(String s) {
        String[] words = s.split(" ");
        int shortest = words[0].length();
        for (String word : words) {
            if (word.length() < shortest) {
                shortest = word.length();
            }
        }
        return shortest;
    }
}
