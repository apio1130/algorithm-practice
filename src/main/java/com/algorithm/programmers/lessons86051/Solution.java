package com.algorithm.programmers.lessons86051;

import java.util.stream.IntStream;

/**
 * 없는 숫자 더하기
 */
class Solution {
	public int solution(int[] numbers) {
		int totalSum = IntStream.range(0,10).sum();
		int sum = IntStream.of(numbers).sum();
		return totalSum - sum;
	}

	public static void main(String... args) {
		Solution s = new Solution();
		int[] nums = {1};
		System.out.println(s.solution(nums));
	}
}
