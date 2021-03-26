package com.algorithm.programmers.lessons12910;

import java.util.Arrays;

/**
 * 나누어 떨어지는 숫자 배열
 */
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        answer = Arrays.stream(arr).filter(i -> i % divisor == 0).sorted().toArray();
        if (answer.length == 0) {
            answer = new int[] {-1};
        }

        return answer;
    }
}
