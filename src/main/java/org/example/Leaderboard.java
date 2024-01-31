package org.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

public class Leaderboard {

    public static void main(String[] args) {
        List<Integer> ranked = Arrays.asList(100, 90, 90, 80);
        List<Integer> player = Arrays.asList(70, 80, 105);

        System.out.println(climbingLeaderboard(ranked, player)); // [4, 3, 1]
    }
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player)
    {

        Deque<Integer> stack = new ArrayDeque<>();

        // Remove duplicates from the ranked list and add to stack
        for(int score : ranked) {
            if(stack.isEmpty() || stack.peek()!= score) {
                stack.push(score);
            }
        }

        List<Integer> result = new ArrayList<>();

        // Check the suitable position for each player score
        for(int score : player) {
            while(!stack.isEmpty() && score >= stack.peek()) {
                stack.pop();
            }
            result.add(stack.size() + 1);
        }

        return result;


    }

}
