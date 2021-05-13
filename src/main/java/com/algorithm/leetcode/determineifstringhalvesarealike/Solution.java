package com.algorithm.leetcode.determineifstringhalvesarealike;

/**
 * 1704. Determine if String Halves Are Alike
 */
class Solution {
	public boolean halvesAreAlike(String s) {
		int count = 0;
		for (int i = 0; i < s.length() / 2; i++) {
			if(checkVowel(s.charAt(i))) {
				count++;
			}
		}
		for (int i = s.length() / 2; i < s.length(); i++) {
			if(checkVowel(s.charAt(i))) {
				count--;
			}
		}

		return count == 0;
	}

	private boolean checkVowel(char c) {
		return 'a' == c || 'e' == c || 'i' == c || 'o' == c || 'u' == c
			|| 'A' == c || 'E' == c || 'I' == c || 'O' == c || 'U' == c;
	}
}
