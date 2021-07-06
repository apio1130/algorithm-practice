package com.algorithm.programmers.lessons12943;

/**
 * 콜라츠 추측
 */
class Solution {
	public int solution(int num) {
		int answer = 0;
		int idx = 0;
		long temp = num;
		while(idx < 500) {
			if (temp == 1) {
				break;
			}
			temp = temp % 2 == 0 ? temp / 2 : temp * 3 + 1;
			idx++;
		}
		if (idx == 500) {
			return -1;
		}
		answer = idx;
		return answer;
	}
}
