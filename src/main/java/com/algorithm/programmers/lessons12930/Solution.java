package com.algorithm.programmers.lessons12930;

/**
 * 이상한 문자 만들기
 */
class Solution {
	public String solution(String s) {
		String answer = "";
		char[] charArray = s.toCharArray();

		StringBuilder sb = new StringBuilder();

		int checkIdx = 0;
		for (char c : charArray) {
			if (c == ' ') {
				sb.append(c);
				checkIdx = 0;
			} else {
				if (checkIdx % 2 == 0) {
					sb.append(Character.toUpperCase(c));
				} else {
					sb.append(Character.toLowerCase(c));
				}
				checkIdx++;
			}
		}
		answer = sb.toString();
		return answer;
	}
}