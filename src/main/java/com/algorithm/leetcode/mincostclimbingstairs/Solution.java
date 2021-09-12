package com.algorithm.leetcode.mincostclimbingstairs;

/**
 * 746. Min Cost Climbing Stairs
 */
class Solution {
	public int minCostClimbingStairs(int[] cost) {
		int[] result = new int[cost.length + 1];

		for (int i = 2; i <= cost.length; i++) {
			result[i] = Math.min(cost[i-2] + result[i-2], cost[i-1] + result[i-1]);
		}

		return result[cost.length];
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		// int[] cost = {10,15,20};
		// int[] cost = {1,100,1,1,1,100,1,1,100,1};
		int[] cost = {0, 1, 2, 2};
		System.out.println(s.minCostClimbingStairs(cost));
	}
}