package com.algorithm.programmers.lessons12928;

/**
 * 약수의 합
 */
class Solution {
	public int solution(int n) {
		int answer = n;

		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				answer += i;
			}
		}

		return answer;
	}
}