package com.algorithm.programmers.lessons12916;

/**
 * 문자열 내 p와 y의 개수
 */
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        if (s == null || s.isEmpty()) {
            return true;
        }

        char[] chars = s.toCharArray();
        int pCount = 0;
        int yCount = 0;

        for (char c : chars) {
            if (c == 'y' || c == 'Y') {
                yCount++;
            } else if (c == 'p' || c == 'P') {
                pCount++;
            }
        }

        return pCount == yCount;
    }
}
