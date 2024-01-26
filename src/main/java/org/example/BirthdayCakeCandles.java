package org.example;

import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int tallestCandleOccurrence = 0;
        int tallestCandleSize = 0;

        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) == tallestCandleSize) {
                tallestCandleOccurrence++;
            }

            if (candles.get(i) > tallestCandleSize) {
                tallestCandleSize = candles.get(i);
                tallestCandleOccurrence = 1;
            }

        }
        return tallestCandleOccurrence;
    }
}
