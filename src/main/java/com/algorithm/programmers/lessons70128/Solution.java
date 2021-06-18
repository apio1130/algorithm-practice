package com.algorithm.programmers.lessons70128;

/**
 * 내적
 */
class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int length = a.length;
        for (int i = 0; i < length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}