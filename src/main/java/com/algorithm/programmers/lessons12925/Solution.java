package com.algorithm.programmers.lessons12925;

/**
 * 문자열을 정수로 바꾸기
 */
class Solution {
	public int solution(String s) {
		int answer = 0;
		char[] chars = s.toCharArray();
		for (int i = s.length()-1, j = 1; i >= 0; i--, j*=10) {
			if (i == 0 && (chars[i] == '-' || chars[i] == '+')) {
				answer *= chars[i] == '-' ? -1 : 1;
			} else {
				answer += (chars[i] - '0') * j;
			}
		}
		return answer;
	}
}