package com.algorithm.programmers.lessons17682;

import java.util.ArrayList;
import java.util.List;

/**
 * 다트 게임
 */
class Solution {
	public int solution(String dartResult) {
		int answer = 0;
		char[] chars = dartResult.toCharArray();
		List<Integer> list = new ArrayList<>();
		int num = 0;
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			if (c >= '0' && c <= '9') {
				if (num > 0) {
					num *= 10;
				}
				num += c - '0';
			} else if (c == 'S' || c == 'D' || c == 'T') {
				num = c == 'D' ? (int)Math.pow(num, 2) : c == 'T' ? (int)Math.pow(num, 3) : num;
				if ((i + 1) < chars.length && (chars[i+1] == '*' || chars[i+1] == '#')) {
					if (chars[i+1] == '*') {
						if (!list.isEmpty()) {
							int beforeIdx = list.size() - 1;
							list.set(beforeIdx, list.get(beforeIdx) * 2);
						}
						num *= 2;
					} else {
						num *= -1;
					}
				}
				list.add(num);
				num = 0;
			}
		}

		answer = list.stream().mapToInt(Integer::intValue).sum();
		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		String str = "1S2D*3T";
		System.out.println(s.solution(str));
	}
}
