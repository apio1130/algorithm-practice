package com.algorithm.programmers.lessons77884;

/**
 * 약수의 개수와 덧셈
 */
class Solution {
	public int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) {
			if (getDivisorCount(i) % 2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}
		}

		return answer;
	}

	private int getDivisorCount(int num) {
		int cnt = 1;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String... args) {
		Solution s = new Solution();
		int left = 2;
		int right = 4;
		System.out.println(s.solution(left, right));
	}
}
