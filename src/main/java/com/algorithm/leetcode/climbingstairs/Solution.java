package com.algorithm.leetcode.climbingstairs;

/**
 * 70. Climbing Stairs
 *
 */
class Solution {
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }

        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;

        for (int i = 3; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }

        return nums[n];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 44;
        System.out.println(s.climbStairs(n));
    }
}