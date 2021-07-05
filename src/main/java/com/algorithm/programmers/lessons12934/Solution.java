package com.algorithm.programmers.lessons12934;

/**
 * 정수 제곱근 판별
 */
class Solution {
	public long solution(long n) {
		long answer = 0;
		long temp = (long)Math.sqrt(n);
		if (temp * temp != n) {
			return -1;
		}
		answer = (long)Math.pow(temp + 1, 2);
		return answer;
	}

	public static void main(String... args) {
		Solution s = new Solution();
		System.out.println(s.solution(9));
	}
}
