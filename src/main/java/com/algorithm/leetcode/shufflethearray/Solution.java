package com.algorithm.leetcode.shufflethearray;

import java.util.Arrays;

/**
 * 1470. Shuffle the Array
 *
 */
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] origin = nums.clone();
        
        for (int i = 0; i < n; i++) {
            nums[2*i] = origin[i];
            nums[2*i+1] = origin[i+n];
        }
        
        return nums;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        s.shuffle(nums, n);
        System.out.println(Arrays.toString(nums));
    }
}
