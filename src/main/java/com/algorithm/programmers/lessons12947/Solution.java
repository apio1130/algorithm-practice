package com.algorithm.programmers.lessons12947;

/**
 * 하샤드 수
 */
class Solution {
	public boolean solution(int x) {
		int sum = 0;
		int temp = x;
		while(temp != 0) {
			sum += temp % 10;
			temp /= 10;
		}
		return x % sum == 0;
	}
}