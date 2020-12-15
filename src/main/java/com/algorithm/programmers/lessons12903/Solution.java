package com.algorithm.programmers.lessons12903;

/**
 * 가운데 글자 가져오기
 */
class Solution {
    public String solution(String s) {
        int index = s.length();
        return index % 2 == 0 ? s.substring(index/2 -1, index/2 + 1) : s.substring(index/2, index/2 + 1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("abcd"));
        System.out.println(s.solution("abc"));
        System.out.println(s.solution("a"));
    }
}
