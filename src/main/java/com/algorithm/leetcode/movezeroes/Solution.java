package com.algorithm.leetcode.movezeroes;

import java.util.Arrays;

/**
 * 283. Move Zeroes
 *
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                idx++;
            }
        }
        
        System.out.println(Arrays.toString(nums));
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        s.moveZeroes(new int[]{0,1,0,3,12});
    }
}
