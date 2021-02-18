package com.algorithm.programmers.lessons12918;

/**
 * 문자열 다루기 기본
 */
class Solution {
    public boolean solution(String s) {
        return s.matches("^([0-9]{4}|[0-9]{6})");
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String text = "1234";
        System.out.println(s.solution(text));;
    }
}
