package com.algorithm.leetcode.numbercomplement;

/**
 * 476. Number Complement
 */
class Solution {
    public int findComplement(int num) {
        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            sb.append(num % 2);
            num /= 2;
        }

        StringBuilder result = new StringBuilder();

        for (int i = sb.length() -1; i >= 0; i--) {
            result.append('0' == sb.charAt(i) ? '1' : '0');
        }

        return Integer.parseInt(result.toString(), 2);
    }

    public static void main(String... args) {
        Solution s = new Solution();
        System.out.println(s.findComplement(5));
    }
}