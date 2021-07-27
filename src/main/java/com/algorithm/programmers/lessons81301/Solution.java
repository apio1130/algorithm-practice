package com.algorithm.programmers.lessons81301;

import java.util.HashMap;
import java.util.Map;

/**
 * 숫자 문자열과 영단어
 */
class Solution {
	public int solution(String s) {
		int answer = 0;
		Map<String, String> map = getConverter();
		for (String key : map.keySet()) {
			if (s.contains(key)) {
				s = s.replaceAll(key, map.get(key));
			}
		}

		answer = Integer.parseInt(s);

		return answer;
	}

	private Map<String, String> getConverter() {
		Map<String, String> map = new HashMap<>();
		map.put("zero", "0");
		map.put("one", "1");
		map.put("two", "2");
		map.put("three", "3");
		map.put("four", "4");
		map.put("five", "5");
		map.put("six", "6");
		map.put("seven", "7");
		map.put("eight", "8");
		map.put("nine", "9");
		return map;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		String a = "one4seveneight";
		System.out.println(s.solution(a));
	}
}
