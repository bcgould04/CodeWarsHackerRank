package org.example;

import java.util.ArrayList;
import java.util.List;

/*
apples located a = 4
oranges located b = 12
number of apples m = 3
number of oranges n = 3

apples units distance from a = [2, 3, -4]
oranges units distance from b = [3, -2, -4]

s: integer, starting point of Sam's house location.
t: integer, ending location of Sam's house location.
a: integer, location of the Apple tree.
b: integer, location of the Orange tree.
apples: integer array, distances at which each apple falls from the tree.
oranges: integer array, distances at which each orange falls from the tree.

*/
public class ApplesAndOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int applesOnHouse = 0;
        int orangesOnHouse = 0;


        for (Integer apple : apples) {
            int applePosition =a + apple;
            if (applePosition >= s && applePosition <= t) {
                applesOnHouse++;
            }
        }

        for (Integer orange : oranges) {
            int orangePosition = b + orange;
            if (orangePosition >= s && orangePosition <= t) {
                orangesOnHouse++;
            }
        }

        System.out.println(applesOnHouse);
        System.out.println(orangesOnHouse);

    }
}
