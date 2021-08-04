package com.algorithm.programmers.lessons82612;

/**
 * 부족한 금액 계산하기
 */
class Solution {
	public long solution(int price, int money, int count) {
		long answer = -1;
		long temp  = (long)price * (1 + count) * count / 2;
		answer = temp > money ? temp - money : 0;
		return answer;
	}
}
