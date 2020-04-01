package com.algorithm.programmers.lessons42748;

import java.util.Arrays;

/**
 * K번째수
 * 
 */
class Solution {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cmdCnt = commands.length;

        for (int i = 0; i < cmdCnt; i++) {
            int beginIdx = commands[i][0] - 1;
            int endIdx = commands[i][1];
            int targetIdx = commands[i][2] - 1;

            int[] subArr = Arrays.copyOfRange(array, beginIdx, endIdx);
            Arrays.sort(subArr);
//            System.out.println(Arrays.toString(subArr));
            answer[i] = subArr[targetIdx];
        }

        return answer;
    }

    public static void main(String... args) {
        Solution solution = new Solution();

        int[] array = { 1, 5, 2, 6, 3, 7, 4 };
        int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
        int[] result = solution.solution(array, commands);
        System.out.println(Arrays.toString(result));
    }
}