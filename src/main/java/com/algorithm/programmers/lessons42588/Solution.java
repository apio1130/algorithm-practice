package com.algorithm.programmers.lessons42588;

import java.util.Arrays;
import java.util.Stack;

/**
 * 탑
 */
class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Arrays.fill(answer, 0);

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            stack.push(heights[i]);
        }

        while (!stack.empty()) {
            int now = stack.pop();
            Stack<Integer> searchStack = (Stack<Integer>) stack.clone();
            int position = searchStack.size();

            while (!searchStack.isEmpty()) {
                int temp = searchStack.pop();
                if (now < temp) {
                    answer[position] = searchStack.size() + 1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] heights = { 6, 9, 5, 7, 4 };
        int[] result = solution.solution(heights);
        System.out.println(Arrays.toString(result));
    }
}