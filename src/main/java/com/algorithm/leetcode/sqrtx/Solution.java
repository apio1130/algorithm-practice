package com.algorithm.leetcode.sqrtx;

/**
 * 69. Sqrt(x)
 */
class Solution {
	public int mySqrt(int x) {
		if (x == 0) {
			return 0;
		}

		long result = x;
		while (result * result > x) {
			result = (result + x / result) / 2;
		}

		return (int)result;
	}

	public static void main(String... args) {
		Solution s = new Solution();
		int num = 8;
		System.out.println(s.mySqrt(num));
	}
}