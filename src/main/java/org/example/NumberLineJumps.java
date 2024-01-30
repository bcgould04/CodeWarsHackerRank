/*
You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).

The first kangaroo starts at location  and moves at a rate of  meters per jump.
The second kangaroo starts at location  and moves at a rate of  meters per jump.
You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.


After one jump, they are both at , (, ), so the answer is YES.

Function Description

Complete the function kangaroo in the editor below.

kangaroo has the following parameter(s):

int x1, int v1: starting position and jump distance for kangaroo 1
int x2, int v2: starting position and jump distance for kangaroo 2
Returns

string: either YES or NO
Input Format

A single line of four space-separated integers denoting the respective values of , , , and .

Constraints

Sample Input 0

0 3 4 2
Sample Output 0

YES
Explanation 0

The two kangaroos jump through the following sequence of locations:
* */

package org.example;

public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {

        if ((x1>x2 && v1>=v2) || (x2>x1 && v2>=v1)) {
            return "NO";
        } else if ((x1<x2 && v1>v2 && (x2-x1) % (v1-v2) == 0) || (x2<x1 && v2>v1 && (x1-x2) % (v2-v1) == 0)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}

/*
This program works by checking if the difference in start locations is divisible by the difference in jump distances. If it is, then the kangaroos will land at the same location at some point. By using modulo operator (%), it checks whether there's a jump number where they will meet; this eliminates the need for a loop. Therefore, it's more time-efficient and simplifies the code. To ensure this, it checks if either kangaroo is ahead AND has a jump length at least as high as the other's; if so, it immediately returns "NO" since the kangaroo in the back can never catch up. Otherwise, it checks whether the kangaroo in the back can catch up in an integer amount of jumps (so they land exactly at the same spot). If so, it returns "YES", if not, "NO".
*/