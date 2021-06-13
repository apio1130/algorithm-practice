package com.algorithm.programmers.lessons17681;

/**
 * 비밀지도
 */
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String temp = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]))
                    .replaceAll("1", "#")
                    .replaceAll("0", " ");
            answer[i] = temp;
        }
        return answer;
    }
}
