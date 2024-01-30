package org.example;

import java.util.List;

public class SockPairs {

    public static int sockMerchant(int n, List<Integer> ar) {
        int pairs = 0;
        int[] socks = new int[101];

        for (int sock : ar) {
            socks[sock]++;
        }

        for (int sock : socks) {
            pairs += sock / 2;
        }

        return pairs;

    }
}
