package com.algorithm.programmers.lessons72410;

/**
 * 신규 아이디 추천
 */
class Solution {
	public String solution(String new_id) {
		new_id = new_id.toLowerCase()
			.replaceAll("([^a-z0-9-_.])+", "")
			.replaceAll("([.])+", ".")
			.replaceAll("(^[.]|[.]$)", "");
		if (new_id.isEmpty()) {
			new_id = "a";
		}
		if (new_id.length() > 15) {
			new_id = new_id.substring(0, 15).replaceAll("([.]$)", "");
		}
		if(new_id.length() < 3) {
			int gap = 3 - new_id.length();
			for (int i = 0; i < gap; i++) {
				new_id += new_id.charAt(new_id.length() - 1);
			}
		}

		return new_id;
	}

	public static void main(String... args) {
		Solution s = new Solution();
		// String newId = "...!@BaT#*..y.abcdefghijklm";
		// String newId = "z-+.^.";
		// String newId = "=.=";
		String newId = "abcdefghijklmn.p";
		System.out.println(s.solution(newId));
	}
}