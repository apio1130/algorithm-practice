package com.algorithm.programmers.lessons68935;

/**
 * 3진법 뒤집기
 */
class Solution {
	public int solution(int n) {
		int answer = 0;

		String temp = Integer.toString(n, 3);
		StringBuilder sb = new StringBuilder();

		for (char c :temp.toCharArray()) {
			sb.append(c);
		}

		answer = Integer.parseInt(sb.reverse().toString(), 3);
		return answer;
	}
}
