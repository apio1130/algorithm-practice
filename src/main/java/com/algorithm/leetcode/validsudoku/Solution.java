package com.algorithm.leetcode.validsudoku;

import java.util.Arrays;

/**
 * 36. Valid Sudoku
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        if (checkV(board, 0) && checkH(board, 0) && checkThreeByThree(board, 0)) {
            return true;
        }

        return false;   
    }
    
    public boolean checkV(char[][] board, int idx) {
        if (idx > 8) {
            return true;
        }

        char[] arr = new char[9];
        System.arraycopy(board[idx], 0, arr, 0, board[idx].length);
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            char temp = arr[i];
            if ((temp != '.') && i > 0 && (arr[i-1] == temp)) {
                return false;
            }
        }

        return checkV(board, ++idx);
    }

    public boolean checkH(char[][] board, int idx) {
        if (idx > 8) {
            return true;
        }

        char[] arr = new char[9];
        for (int i = 0; i < arr.length; i++) {
            char temp = board[i][idx];
            arr[i] = temp;
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            char temp = arr[i];
            if ((temp != '.') && i > 0 && (arr[i-1] == temp)) {
                return false;
            }
        }

        return checkH(board, ++idx);
    }
    
    public boolean checkThreeByThree(char[][] board, int idx) {
        if (idx > 8) {
            return true;
        }

        
        int[][] map = {{0,0},{0,3},{0,6},{3,0},{3,3},{3,6},{6,0},{6,3},{6,6}};
        int x = map[idx][0];
        int y = map[idx][1];

        char[] arr = new char[9];
        for (int i = 0; i < arr.length; i++) {
            int xIcs = i % 3;
            int yIcs = i / 3;
            char temp = board[y+yIcs][x+xIcs];
            arr[i] = temp;
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            char temp = arr[i];
            if ((temp != '.') && i > 0 && (arr[i-1] == temp)) {
                return false;
            }
        }

        return checkThreeByThree(board, ++idx);
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        char[][] boadFail = {
            {'8','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
          };

        Solution solution = new Solution();
        System.out.println(solution.isValidSudoku(board));
        System.out.println(solution.isValidSudoku(boadFail));
    }
}
