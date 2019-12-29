package com.algorithm.programmers.lessons42578;

class TestMain {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
							   { "green_turban", "headgear" } };
		int result = solution.solution(clothes);
		System.out.println(result);
	}
}
