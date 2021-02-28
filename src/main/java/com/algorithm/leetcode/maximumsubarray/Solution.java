package com.algorithm.leetcode.maximumsubarray;

/**
 * 53. Maximum Subarray
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(currMax + nums[i], nums[i]);
            max = Math.max(currMax, max);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        // int[] nums = {1, 2, -1, -2, 2, 1, -2, 1, 4, -5, 4};
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(s.maxSubArray(nums));
    }
}
