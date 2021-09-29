package com.algorithm.programmers.lessons86051;

import java.util.stream.IntStream;

/**
 * 없는 숫자 더하기
 */
class Solution {
	public int solution(int[] numbers) {
		return IntStream.rangeClosed(0, 9)
						 .filter(num -> IntStream.of(numbers).noneMatch(n -> n == num))
						 .sum();
	}

	public static void main(String... args) {
		Solution s = new Solution();
		int[] nums = {1};
		System.out.println(s.solution(nums));
	}
}
