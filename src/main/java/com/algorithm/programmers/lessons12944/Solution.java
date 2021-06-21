package com.algorithm.programmers.lessons12944;

import java.util.Arrays;

/**
 * 평균 구하기
 */
class Solution {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}