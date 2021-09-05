package com.algorithm.leetcode.subsets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 78. Subsets
 */
class Solution {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		result.add(Collections.emptyList());

		for (int num : nums) {
			List<List<Integer>> newSubsets = new ArrayList<>();
			for (List<Integer> curr : result) {
				List<Integer> temp = new ArrayList<>(curr);
				temp.add(num);
				newSubsets.add(temp);
			}

			for (List<Integer> curr : newSubsets) {
				result.add(curr);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {1,2,3};
		System.out.println(s.subsets(nums));
	}

}
