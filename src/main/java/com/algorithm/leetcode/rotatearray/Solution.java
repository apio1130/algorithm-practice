package com.algorithm.leetcode.rotatearray;

import java.util.Arrays;

/**
 * 189. Rotate Array
 *
 */
class Solution {
    public void rotate(int[] nums, int k) {
        int[] origin = nums.clone();

        int move = k % nums.length;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = origin[(nums.length - move + i) % nums.length];
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = { 1,2,3 };
        int k = 4;
        s.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
