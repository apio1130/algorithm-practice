package com.algorithm.leetcode.arraypartitioni;

import java.util.Arrays;

/**
 * 561. Array Partition I
 */
class Solution {
	public int arrayPairSum(int[] nums) {
		int result = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i += 2) {
			result += nums[i];
		}
		return result;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		// int[] nums = {1,4,3,2};
		int[] nums = {6, 2, 6, 5, 1, 2};
		System.out.println(s.arrayPairSum(nums));
	}
}
