package com.algorithm.leetcode.smallestrangei;

/**
 * 908. Smallest Range I
 */
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return (min + k >= max - k) ? 0 : (max - k) - (min + k);
    }
}
