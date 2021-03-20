package com.algorithm.leetcode.goalparserinterpretation;

/**
 * 1678. Goal Parser Interpretation
 */
class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        char[] chars = command.toCharArray();

        boolean check = false;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(') {
                check = true;
            } else {
                if (check && c == ')') {
                    check = false;
                    if (chars[i -1] == '(') {
                        sb.append('o');
                    }
                } else {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        // String command = "G()(al)";
        String command = "G()()()()(al)";
        System.out.println(s.interpret(command));
    }
}
