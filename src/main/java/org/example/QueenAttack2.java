package org.example;

import java.util.List;

/*
*  int n: the number of rows and columns in the board
-  int k: the number of obstacles on the board
-  int r_q: the row number of the queen's position
-  int c_q: the column number of the queen's position
-  int obstacles[k][2]: each element is an array of  integers, the row and column of an obstacle
 */
public class QueenAttack2 {
    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        int up = n - r_q;
        int down = r_q - 1;
        int right = n - c_q;
        int left = c_q - 1;
        int up_right = Math.min(up, right);
        int up_left = Math.min(up, left);
        int down_right = Math.min(down, right);
        int down_left = Math.min(down, left);

        for (int i = 0; i < k; i++) {
            if (obstacles.get(i).get(1) == c_q) {
                if (obstacles.get(i).get(0) < r_q) {
                    down = Math.min(down, r_q - obstacles.get(i).get(0) - 1);
                } else {
                    up = Math.min(up, obstacles.get(i).get(0) - r_q - 1);
                }
            } else if (obstacles.get(i).get(0) == r_q) {
                if (obstacles.get(i).get(1) < c_q) {
                    left = Math.min(left, c_q - obstacles.get(i).get(1) - 1);
                } else {
                    right = Math.min(right, obstacles.get(i).get(1) - c_q - 1);
                }
            } //Diagonal
            else if (Math.abs(obstacles.get(i).get(0) - r_q) == Math.abs(obstacles.get(i).get(1) - c_q)) {
                if (obstacles.get(i).get(0) > r_q) {
                    if (obstacles.get(i).get(1) > c_q) {
                        up_right = Math.min(up_right, obstacles.get(i).get(0) - r_q - 1);
                    } else {
                        up_left = Math.min(up_left, obstacles.get(i).get(0) - r_q - 1);
                    }
                } else {
                    if (obstacles.get(i).get(1) > c_q) {
                        down_right = Math.min(down_right, r_q - obstacles.get(i).get(0) - 1);
                    } else {
                        down_left = Math.min(down_left, r_q - obstacles.get(i).get(0) - 1);
                    }
                }
            }
        }

        return up + down + right + left + up_right + up_left + down_right + down_left;
    }
}


/*
* This solution performs in O(k) which is the best we can get for this problem.
In this solution, for each direction, we initially assume that the queen can move till the end of the board. Then, for each obstacle, we check if the obstacle is in the path of the queen. If it is and if it is the first obstacle in that direction, we update the maximum possible position in that direction to the obstacle position.
* */