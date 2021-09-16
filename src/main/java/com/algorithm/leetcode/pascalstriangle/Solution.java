package com.algorithm.leetcode.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 */
class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<>();
		list.add(List.of(1));

		for (int i = 1; i < numRows; i++) {
			list.add(calculateList(list.get(i - 1)));
		}

		return list;
	}

	private List<Integer> calculateList(List<Integer> list) {
		List<Integer> calList = new ArrayList<>();
		calList.add(1);
		for (int i = 0; i < list.size() - 1; i++) {
			calList.add(list.get(i) + list.get(i + 1));
		}
		calList.add(1);
		return calList;
	}

	public static void main(String... args) {
		Solution s = new Solution();
		System.out.println(s.generate(3));
	}
}
