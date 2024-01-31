package org.example;

import java.util.Collections;
import java.util.List;

public class HurdleRace {
    public static int hurdleRace(int k, List<Integer> height) {
        int tallestHurdel = Collections.max(height);
        return tallestHurdel > k ? tallestHurdel - k : 0;
    }
}
