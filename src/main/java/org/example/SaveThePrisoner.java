package org.example;

public class SaveThePrisoner {
    public static int saveThePrisoner(int n, int m, int s) {
        return ((s-1) + (m-1)) % n + 1;
    }
}
