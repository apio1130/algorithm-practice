package com.algorithm.programmers.lessons84325;

import java.util.HashMap;
import java.util.Map;

/**
 * 직업군 추천하기
 */
class Solution {
	public String solution(String[] table, String[] languages, int[] preference) {
		String answer = "";
		String[] key = new String[table.length];
		Map<String, Table> dataMap = new HashMap<>();

		for (int i = 0; i < table.length; i++) {
			String[] data = table[i].split(" ");
			key[i] = data[0];
			dataMap.put(key[i], new Table(data));
		}

		int max = 0;
		int maxIdx = -1;
		for (int i = 0; i < key.length; i++) {
			Table data = dataMap.get(key[i]);
			int sum = 0;
			for (int j = 0; j < languages.length; j++) {
				sum += data.getScoreMap().getOrDefault(languages[j], 0) * preference[j];
			}
			if (sum > max) {
				max = sum;
				maxIdx = i;
			} else if (sum == max && key[maxIdx].compareTo(key[i]) > 0) {
				maxIdx = i;
			}
		}

		answer = key[maxIdx];
		return answer;
	}

	private static class Table {
		private Map<String, Integer> scoreMap = new HashMap<>();
		private String name;

		public Table(String[] dataArray) {
			this.name = dataArray[0];
			for (int i = 5; i > 0; i--) {
				scoreMap.put(dataArray[i], 6 - i);
			}
		}

		public Map<String, Integer> getScoreMap() {
			return scoreMap;
		}

		public String getName() {
			return name;
		}
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
			"HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
			"GAME C++ C# JAVASCRIPT C JAVA"};

		String[] lauguages = {"JAVA", "JAVASCRIPT"};
		int[] preference = {7, 5};
		System.out.println(s.solution(table, lauguages, preference));
	}
}