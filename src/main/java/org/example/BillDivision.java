package org.example;

import java.util.List;

public class BillDivision {

    public static void main(String[] args) {
        List<Integer> bill = List.of(3, 10, 2, 9);
        int k = 1;
        int b = 7;
        bonAppetit(bill, k, b);
    }
    public static void bonAppetit(List<Integer> bill, int k, int b) {

        int actual = 0;
        for (int cost: bill) {
            actual += cost;
        }
        actual = (actual - bill.get(k)) / 2;

        if (b == actual) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - actual);
        }

    }
}
