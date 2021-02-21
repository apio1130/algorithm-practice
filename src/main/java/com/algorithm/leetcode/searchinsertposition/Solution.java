package com.algorithm.leetcode.searchinsertposition;

/**
 * 35. Search Insert Position
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (curr == target || curr > target) {
                result = i;
                break;
            }
        }
        return result;
    }
}
