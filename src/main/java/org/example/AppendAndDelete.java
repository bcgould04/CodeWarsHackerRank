package org.example;

public class AppendAndDelete {

    public static String appendAndDelete(String s, String t, int k) {
        int commonLength = 0;
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }
            commonLength++;
        }
        int minOperations = (s.length() - commonLength) + (t.length() - commonLength);
        if (k >= s.length() + t.length() || (k >= minOperations && (k - minOperations) % 2 == 0)) {
            return "Yes";
        }
        return "No";
    }
}
