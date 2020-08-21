package com.algorithm.leetcode.numberofonebits;

/**
 * 191. Number of 1 Bits
 *
 */
class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        int check = ~Integer.MAX_VALUE;
        while (n != 0) {
            int temp = n & check;
            if (temp == check) {
                count++;
            }
            n = n << 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        System.out.println(solution.hammingWeight(n));
    }
}
