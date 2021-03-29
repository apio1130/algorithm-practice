package com.algorithm.programmers.lessons12937;

/**
 * 짝수와 홀수
 */
class Solution {
    public String solution(int num) {
        if (num < 0) {
            num *= -1;
        }
        return num % 2 == 1 ? "Odd" : "Even";
    }
}
