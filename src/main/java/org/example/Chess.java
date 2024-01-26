/*
We can represent these eight directions with coordinate changes, dx and dy.
Note that the coordinates start from 0 (e.g., a1 becomes 0,0 and h8 becomes 7,7)

In the knight function, we first initialize the visited array to -1.
startX and startY represent the starting cell coordinates and stopX and stopY represent the destination cell coordinates.

We create a queue and add the source coordinate to it, then mark it as visited by assigning 0 in the visited array.

We dequeue an element from the queue, if it is the destination, we return the minimum number of steps. If not, add its unvisited neighboring cells to the queue and mark them as visited.

The isValid function is used to check whether the new coordinates are within the chessboard boundaries or not.
 */

package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Chess {

    private static int[] dx = {-2, -1, 1, 2, -2, -1, 1, 2};
    private static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    public static int knight(String start, String  finish) {
        int[][] visited = new int[8][8];
        for (int i = 0; i < 8; i++) {
            Arrays.fill(visited[i], -1);
        }

        int startX = start.charAt(0) - 'a';
        int startY = Character.getNumericValue(start.charAt(1)) - 1;

        int finishX = finish.charAt(0) - 'a';
        int finishY = Character.getNumericValue(finish.charAt(1)) - 1;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {startX, startY});
        visited[startX][startY] = 0;

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            if (point[0] == finishX && point[1] == finishY) {
                return visited[finishX][finishY];
            }

            for (int i = 0; i < 8; i++) {
                int newX = point[0] + dx[i];
                int newY = point[1] + dy[i];

                if (isValid(newX, newY) && visited[newX][newY] == -1) {
                    queue.add(new int[] {newX, newY});
                    visited[newX][newY] = visited[point[0]][point[1]] + 1;
                }
            }
        }
        return -1;
    }

    public static boolean isValid(int x, int y) {
        return x >= 0 && y >= 0 && x < 8 && y < 8;
    }
}
