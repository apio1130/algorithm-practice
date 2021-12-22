package com.algorithm.leetcode.concatenationofarray;

/**
 * 1929. Concatenation of Array
 */
class Solution {
	public int[] getConcatenation(int[] nums) {
		int length = nums.length;
		int[] result = new int[length * 2];
		for (int i = 0; i < nums.length; i++) {
			result[i] = nums[i];
			result[i + length] = nums[i];
		}
		return result;
	}
}
