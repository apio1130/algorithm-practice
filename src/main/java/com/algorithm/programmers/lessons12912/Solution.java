package com.algorithm.programmers.lessons12912;

/**
 * 두 정수 사이의 합
 */
class Solution {
    public long solution(int a, int b) {
        if (a == b) {
            return a;
        }
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        return (long)((min + max) * (max - min + 1)) / 2;
    }
}
