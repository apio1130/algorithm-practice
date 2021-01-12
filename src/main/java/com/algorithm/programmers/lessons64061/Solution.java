package com.algorithm.programmers.lessons64061;

import java.util.Stack;

/**
 * 크레인 인형뽑기 게임
 *
 */
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int delCount = 0;
        for (int i = 0; i < moves.length; i++) {
            int target = moves[i];
            int doll = moveCrain(board, target);
            int result = doll != 0 ? storeDoll(stack, doll) : 0;
            if (result > 0) {
                delCount += result;
            }
        }

        return delCount;
    }

    private int storeDoll(Stack<Integer> stack, int doll) {
        if (stack.isEmpty()) {
            stack.push(doll);
            return 0;
        }

        stack.push(doll);

        int result = 0;
        boolean check = false;
        do {
            if (stack.size() < 2) {
                break;
            }
            int a = stack.pop();
            int b = stack.pop();
            if (a != b) {
                stack.push(b);
                stack.push(a);
                check = true;
            } else {
                result+=2;
            }
        } while (!check);

        return result;
    }

    private int moveCrain(int[][] board, int target) {
        int result = 0;
        int idx = target - 1;
        int length = board.length;
        for (int i = 0; i < length; i++) {
            int temp = board[i][idx];
            if (temp != 0) {
                result = temp;
                board[i][idx] = 0;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] board = { { 0, 0, 0, 0, 0 }, 
                          { 0, 0, 1, 0, 3 }, 
                          { 0, 2, 5, 0, 1 }, 
                          { 4, 2, 4, 4, 2 },
                          { 3, 5, 1, 3, 1 } };
        int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
//        int[] moves = { 1, 5, 3, 5, 1, 2, 5, 1, 4, 3 };
        int result = s.solution(board, moves);
        System.out.println(result);
    }
}