package com.algorithm.programmers.lessons12909;

import java.util.Stack;

/**
 * 올바른 괄호
 */
class Solution {
	boolean solution(String s) {
		boolean answer = true;
		Stack<Character> stack = new Stack<>();
		int length = s.length();

		for (int i = 0; i < length; i++) {
			char temp = s.charAt(i);
			if (stack.isEmpty()) {
				stack.push(temp);
			} else {
				if (stack.peek() == '(' && temp == ')') {
					stack.pop();
				} else {
					stack.push(temp);
				}
			}
		}

		if (!stack.isEmpty()) {
			answer = false;
		}

		return answer;
	}

	public static void main(String... args) {
		Solution s = new Solution();
		String txt = "(())()";
		System.out.println(s.solution(txt));
	}
}
