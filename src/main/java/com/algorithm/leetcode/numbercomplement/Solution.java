package com.algorithm.leetcode.numbercomplement;

/**
 * 476. Number Complement
 */
class Solution {
    public int findComplement(int num) {
        int length = 0;
        int temp = num;

        while (temp > 0) {
            temp = temp >> 1;
            length++;
        }

        return ((1 << length) -1) ^ num;
    }

    public static void main(String... args) {
        Solution s = new Solution();
        System.out.println(s.findComplement(5));
    }
}