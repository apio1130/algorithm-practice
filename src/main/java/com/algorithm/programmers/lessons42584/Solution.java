package com.algorithm.programmers.lessons42584;

import java.util.Arrays;

/**
 * 주식가격
 */
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int count = 0;
            for (int j = i + 1; j < prices.length; j++) {
                count++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }

            answer[i] = count;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] testCase1 = { 1, 2, 3, 2, 3 };
        int[] answer = solution.solution(testCase1);
        Arrays.stream(answer).forEach(System.out::println);
    }
}
