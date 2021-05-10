package com.algorithm.leetcode.signoftheproductofanarray;

/**
 * 1822. Sign of the Product of an Array
 */
class Solution {
	public int arraySign(int[] nums) {
		int result = 1;
		for (int num : nums) {
			if (num == 0) {
				result = 0;
				break;
			}
			if (num < 0) {
				result *= -1;
			}
		}
		return Integer.compare(result, 0);
	}
}
