package com.algorithm.leetcode.sortingthesentence;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 1859. Sorting the Sentence
 */
class Solution {
	public String sortSentence(String s) {
		StringTokenizer st = new StringTokenizer(s);
		String[] arr = new String[st.countTokens()];
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			int length = token.length();
			arr[Integer.parseInt(token.substring(length - 1, length)) - 1] = token.substring(0, length - 1);
		}

		return Arrays.stream(arr).reduce((a,b) -> a.concat(" ").concat(b)).orElse("");
	}

	public static void main(String... args) {
		Solution s = new Solution();
		System.out.println(s.sortSentence("is2 sentence4 This1 a3"));
	}
}
