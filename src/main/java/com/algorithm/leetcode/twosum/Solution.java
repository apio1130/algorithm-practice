package com.algorithm.leetcode.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 */
class Solution {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int temp = target - num;
			if (map.containsKey(temp)) {
				return new int[] {map.get(temp), i};
			}
			map.put(num, i);
		}
		return null;
	}

	public static void main(String... args) {
		Solution s = new Solution();
		// var nums = new int[] {3, 2, 4};
		// int target = 6;
		var nums = new int[] {-3, 4, 3, 90};
		int target = 0;
		System.out.println(Arrays.toString(s.twoSum(nums, target)));
	}
}
