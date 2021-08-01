package com.algorithm.programmers.lessons12973;

import java.util.Stack;

/**
 * 짝지어 제거하기
 */
class Solution {
	public int solution(String s) {
		Stack<Character> stack = new Stack<>();
		char[] chars = s.toCharArray();
		for (char c : chars) {
			if (!stack.isEmpty() && stack.peek() == c) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}

		return stack.isEmpty() ? 1 : 0;
	}

	public static void main(String... args) throws Exception {
		Solution s = new Solution();
		String txt = "baabaa";
		// String txt = "cdcd";
		System.out.println(s.solution(txt));
	}
}
