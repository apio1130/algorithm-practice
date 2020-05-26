package com.algorithm.leetcode.movezeroes;

import java.util.Arrays;

/**
 * 283. Move Zeroes
 *
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int[] result = new int[nums.length];
        int idx = 0; 
        for (int i = 0; i < nums.length; i++) {
            int numb = nums[i];
            if (numb != 0) {
                result[idx] = numb;
                idx++;
            }
        }
        
        System.arraycopy(result, 0, nums, 0, result.length);
        
        System.out.println(Arrays.toString(nums));
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        s.moveZeroes(new int[]{0,1,0,3,12});
    }
}
