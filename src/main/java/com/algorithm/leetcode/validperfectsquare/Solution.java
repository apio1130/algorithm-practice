package com.algorithm.leetcode.validperfectsquare;

/**
 * 367. Valid Perfect Square
 */
class Solution {
    public boolean isPerfectSquare(int num) {
        int val = (int) Math.sqrt(num);
        return Math.pow(val, 2) == num;
    }

    public static void main(String... args) {
        Solution s = new Solution();
        System.out.println(s.isPerfectSquare(14));
    }
}
