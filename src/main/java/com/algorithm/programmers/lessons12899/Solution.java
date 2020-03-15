package com.algorithm.programmers.lessons12899;

/**
 * 124 나라의 숫자
 *
 */
class Solution {
    public String solution(int n) {
        String answer = "";
        final String[] num = { "4", "1", "2" };

        while (n > 0) {
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int input = 10;
        String result = solution.solution(input);
        System.out.println("result : " + result);
    }
}
