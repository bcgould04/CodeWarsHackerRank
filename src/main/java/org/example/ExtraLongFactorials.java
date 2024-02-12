package org.example;

import java.math.BigInteger;

public class ExtraLongFactorials {

    public static void extraLongFactorials(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = n; i > 0; i--){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);

    }
}
