package com.algorithm.leetcode.pascalstriangleii;

import java.util.ArrayList;
import java.util.List;

/**
 * 119. Pascal's Triangle II
 */
class Solution {
	public List<Integer> getRow(int rowIndex) {
		if (rowIndex == 0) {
			return List.of(1);
		}
		if (rowIndex == 1) {
			return List.of(1,1);
		}

		List<Integer> result = new ArrayList<>();

		List<Integer> beforeList = List.of(1,1);
		for (int i = 1; i < rowIndex; i++) {
			result = process(beforeList);
			beforeList = result;
		}

		return result;
	}

	private List<Integer> process(List<Integer> list) {
		List<Integer> result = new ArrayList<>();
		result.add(1);
		for (int i = 0; i < list.size() - 1; i++) {
			result.add(list.get(i) + list.get(i+1));
		}
		result.add(1);
		return result;
	}

	public static void main(String... args) {
		Solution s = new Solution();
		System.out.println(s.getRow(3));
	}
}
