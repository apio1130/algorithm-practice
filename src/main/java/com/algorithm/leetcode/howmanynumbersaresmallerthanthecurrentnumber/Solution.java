package com.algorithm.leetcode.howmanynumbersaresmallerthanthecurrentnumber;

/**
 * 1365. How Many Numbers Are Smaller Than the Current Number
 */
class Solution {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					count++;
				}
			}
			result[i] = count;
		}
		return result;
	}
}
