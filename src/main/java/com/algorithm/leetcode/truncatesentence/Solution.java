package com.algorithm.leetcode.truncatesentence;

import java.util.StringTokenizer;

/**
 * 1816. Truncate Sentence
 */
class Solution {
	public String truncateSentence(String s, int k) {
		StringTokenizer st = new StringTokenizer(s);
		String[] array = new String[k];
		for (int i = 0; i < k; i++) {
			array[i] = st.nextToken();
		}

		return String.join(" ", array);
	}
}
