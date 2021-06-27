package com.algorithm.programmers.lessons12935;

import java.util.Arrays;

/**
 * 제일 작은 수 제거하기
 */
class Solution {
	public int[] solution(int[] arr) {
		int[] answer = {};
		if (arr.length < 2) {
			return new int[] {-1};
		}
		int min = Arrays.stream(arr).min().getAsInt();
		answer = Arrays.stream(arr).filter(i -> i != min).toArray();
		return answer;
	}
}
