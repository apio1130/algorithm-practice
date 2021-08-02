package com.algorithm.programmers.lessons77484;

import java.util.Arrays;

/**
 * 로또의 최고 순위와 최저 순위
 */
class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = {};
		int zeroCnt = 0;
		for (int lotto : lottos) {
			if (lotto == 0) {
				zeroCnt++;
			}
		}

		int duplicatedNumbs = 0;
		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					duplicatedNumbs++;
					break;
				}
			}
		}

		answer = new int[] {Math.min(7 - duplicatedNumbs - zeroCnt, 6), Math.min(7 - duplicatedNumbs, 6)};
		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] ints = {45, 4, 35, 20, 3, 9};
		int[] ints1 = {20, 9, 3, 45, 4, 35};
		System.out.println(Arrays.toString(s.solution(ints, ints1)));
	}
}