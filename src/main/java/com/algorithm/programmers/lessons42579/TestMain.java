package com.algorithm.programmers.lessons42579;

import java.util.Arrays;

class TestMain {
	public static void main(String... args) {
		Solution s = new Solution();
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
		int[] result = s.solution(genres, plays);
		System.out.println(Arrays.toString(result));
	}
}
