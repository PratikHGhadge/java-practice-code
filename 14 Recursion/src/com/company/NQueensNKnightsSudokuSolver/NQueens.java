package com.company.NQueensNKnightsSudokuSolver;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    static List<List<String>> queens(boolean[][] board, int row){
        if (row== board.length){
//            display(board);
            List<List<String>> list = new ArrayList<>();
            list.add(display(board));
            return list;
        }
        List<List<String>> list = new ArrayList<>();
        // Placing the queen and checking foe every row and column
        for (int col = 0; col< board.length; col++){
            // place the queen if it is safe
            if (isSafe(board, row, col)){
                board[row][col] = true;
                list.addAll(queens(board, row+1));
                board[row][col] = false;
            }
        }
        return list;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        for (int i = 0; i<row; i++){
            if (board[i][col]){
                return false;
            }
        }
        // check diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i<=maxLeft; i++){
            if (board[row-1][col-1]){
                return false;
            }
        }
        // check diagonal right
        int maxRight = Math.min(row, board.length-col-1);
        for (int i = 1; i<=maxRight; i++){
            if (board[row-1][col+1]){
                return false;
            }
        }
        return true;
    }

    private static List<String> display(boolean[][] board) {
        List<String> list = new ArrayList<>();
        for (boolean[] row: board){
            String st = new String();
            for (boolean element : row){
                if (element){
                    st+="Q";
                }else {
                    st+=".";
                }
            }
            list.add(st);
        }
        return list;
    }
}
