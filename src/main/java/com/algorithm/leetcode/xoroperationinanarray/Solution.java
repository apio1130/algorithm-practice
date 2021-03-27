package com.algorithm.leetcode.xoroperationinanarray;

/**
 * 1486. XOR Operation in an Array
 */
class Solution {
    public int xorOperation(int n, int start) {
        int result = start;
        for(int i = 1; i < n; i++) {
            start+=2;
            result ^= start;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 5;
        int start = 0;
        System.out.println(s.xorOperation(n, start));
    }
}
