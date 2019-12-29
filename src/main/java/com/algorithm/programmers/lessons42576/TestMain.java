package com.algorithm.programmers.lessons42576;

class TestMain {
	public static void main(String[] args) {
		Solution solution = new Solution();
//		String[] participant = { "leo", "kiki", "eden" };
//		String[] completion = { "eden", "kiki" };
		String[] participant = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion = { "josipa", "filipa", "marina", "nikola" };
		String result = solution.solution(participant, completion);
		System.out.println(result);
	}
}
