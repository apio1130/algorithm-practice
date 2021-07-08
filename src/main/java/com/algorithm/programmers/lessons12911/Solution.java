package com.algorithm.programmers.lessons12911;

/**
 * 다음 큰 숫자
 */
class Solution {
	public int solution(int n) {
		int answer = 0;
		int count = Integer.bitCount(n);
		int temp = n;
		while (true) {
			int cnt = Integer.bitCount(++temp);
			if (count == cnt) {
				break;
			}
		}
		answer = temp;
		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int n = 15;
		System.out.println(s.solution(n));
	}
}
