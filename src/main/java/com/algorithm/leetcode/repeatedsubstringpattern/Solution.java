package com.algorithm.leetcode.repeatedsubstringpattern;

/**
 * 459. Repeated Substring Pattern
 */
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        boolean result = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() / 2; i++) {
            sb.append(s.charAt(i));
            for (int j = sb.length(); j < s.length(); j += sb.length()) {
                result = true;
                int endIdx = Math.min(j + sb.length(), s.length());
                if (!sb.toString().equals(s.substring(j, endIdx))) {
                    result = false;
                    break;
                }
            }
            if (result) {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String input = "aabaaba";
        System.out.println(s.repeatedSubstringPattern(input));
    }
}