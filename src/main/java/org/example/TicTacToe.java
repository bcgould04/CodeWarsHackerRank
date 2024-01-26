package org.example;

public class TicTacToe {
    public static int isSolved(int[][] board) {
        for(int i=0; i<3; i++){
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2]){
                if(board[i][0] != 0) return board[i][0]; //Checks rows
            }

            if(board[0][i] == board[1][i] && board[1][i] == board[2][i]){
                if(board[0][i] != 0) return board[0][i]; //Checks columns
            }
        }

        //Check diagonals
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2])
            if(board[0][0] != 0) return board[0][0];

        if(board[0][2] == board[1][1] && board[1][1] == board[2][0])
            if(board[0][2] != 0) return board[0][2];

        //Check if game is still not over
        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++)
                if(board[i][j] == 0) return -1;

        //If none of the above conditions were met, then it's a draw.
        return 0;
    }
}
