package com.algorithm.leetcode.determineifstringhalvesarealike;

import java.util.Arrays;
import java.util.List;

/**
 * 1704. Determine if String Halves Are Alike
 */
class Solution {
	public boolean halvesAreAlike(String s) {
		char[] left = s.substring(0, s.length() / 2).toCharArray();
		char[] right = s.substring(s.length() / 2).toCharArray();

		List<Character> list = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
		int leftCnt = 0;
		int rightCnt = 0;
		for (char c: left) {
			if(list.indexOf(c) > -1) {
				leftCnt++;
			}
		}
		for (char c: right) {
			if(list.indexOf(c) > -1) {
				rightCnt++;
			}
		}

		System.out.println(left);
		System.out.println(right);

		return leftCnt == rightCnt;
	}
}
