package com.algorithm.programmers.lessons12933;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 정수 내림차순으로 배치하기
 */
class Solution {
	public long solution(long n) {
		long answer = 0;
		String temp = Arrays.stream(Long.toString(n).split(""))
			.sorted(Comparator.reverseOrder())
			.reduce(String::concat)
			.get();
		answer = Long.parseLong(temp);
		return answer;
	}
}