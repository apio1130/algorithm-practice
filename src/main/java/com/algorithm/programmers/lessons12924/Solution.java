package com.algorithm.programmers.lessons12924;

/**
 * 숫자의 표현
 */
class Solution {
	public int solution(int n) {
		int answer = 1;
		int temp = 1;
		while (temp <= n / 2) {
			int sum = 0;
			for (int i = temp; i < n; i++) {
				sum += i;
				if (sum == n) {
					answer++;
				}
				if (sum >= n) {
					break;
				}
			}
			temp++;
		}

		return answer;
	}

	public static void main(String... args) {
		Solution s = new Solution();
		System.out.println(s.solution(15));
	}
}
