package com.algorithm.programmers.lessons42840;

import java.util.Arrays;

class TestMain {
	public static void main(String... args) {
		Solution solution = new Solution();
		int[] answers = {1,2,3,4,5};
		// int[] answers = {1,3,2,4,2};
		int[] result = solution.solution(answers);
		System.out.println(Arrays.toString(result));
	}
}
