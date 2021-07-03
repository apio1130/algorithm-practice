package com.algorithm.programmers.lessons12915;

import java.util.Arrays;

/**
 * 문자열 내 마음대로 정렬하기
 *
 */
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        Arrays.sort(strings);
        Arrays.sort(strings, (a, b) -> Character.compare(a.charAt(n), b.charAt(n)));
        answer = strings;
        
        return answer;
    }
}