package com.algorithm.programmers.lessons70129;

/**
 * 이진 변환 반복하기
 */
class Solution {
	public int[] solution(String s) {
		int[] answer = {};
		int cnt = 0;
		int removedCnt = 0;

		while (!"1".equals(s)) {
			int beforeLength = s.length();
			int length = s.replaceAll("0", "").length();
			s = Integer.toBinaryString(length);
			removedCnt += beforeLength - length;
			cnt++;
		}

		answer = new int[] {cnt, removedCnt};
		return answer;
	}

}
