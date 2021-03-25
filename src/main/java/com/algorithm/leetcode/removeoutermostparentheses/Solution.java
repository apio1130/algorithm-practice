package com.algorithm.leetcode.removeoutermostparentheses;

/**
 * 1021. Remove Outermost Parentheses
 */
class Solution {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        char[] chars = S.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (c == '(') {
                count++;
                if (count > 1) {
                    sb.append(c);
                }
            } else if (c == ')') {
                if (count > 1) {
                    sb.append(c);
                }
                count--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String S = "()()";
        // String S = "(()())(())";
        System.out.println(s.removeOuterParentheses(S));
    }
}