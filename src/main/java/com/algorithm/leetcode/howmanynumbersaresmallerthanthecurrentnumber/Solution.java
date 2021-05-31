package com.algorithm.leetcode.howmanynumbersaresmallerthanthecurrentnumber;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * 1365. How Many Numbers Are Smaller Than the Current Number
 */
class Solution {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] result = new int[nums.length];
		Supplier<IntStream> supplier = () -> Arrays.stream(nums);

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int count = (int)supplier.get().filter(n -> n < num).count();
			result[i] = count;
		}
		return result;
	}
}
