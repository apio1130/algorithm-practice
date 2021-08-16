package com.algorithm.programmers.lessons1845;

import java.util.Arrays;

/**
 * 폰켓몬
 */
class Solution {
	public int solution(int[] nums) {
		int answer = 0;
		int pickCnt = nums.length / 2;
		int numbKind = (int)Arrays.stream(nums).distinct().count();
		answer = Math.min(numbKind, pickCnt);
		return answer;
	}
}
