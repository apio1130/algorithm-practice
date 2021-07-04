package com.algorithm.programmers.lessons12926;

/**
 *	시저 암호
 */
class Solution {
	public String solution(String s, int n) {
		String answer = "";

		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			chars[i] = solve(chars[i], n);
		}
		answer = new String(chars);
		return answer;
	}

	private char solve(char c, int n) {
		if (c == ' ') {
			return c;
		}

		if (c >= 'a' && c <= 'z') {
			int temp = c - 'a' + n;
			c = (char)('a' + (temp % 26));
		} else {
			int temp = c - 'A' + n;
			c = (char)('A' + (temp % 26));
		}
		return c;
	}
}
