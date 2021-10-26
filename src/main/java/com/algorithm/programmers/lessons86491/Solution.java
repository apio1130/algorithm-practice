package com.algorithm.programmers.lessons86491;

/**
 * 최소직사각형
 */
class Solution {
	public int solution(int[][] sizes) {
		int answer = 0;
		int horizontal = 0;
		int vertical = 0;
		for (int i = 0; i < sizes.length; i++) {
			int[] size = sizes[i];
			int tempHorizontal = 0;
			int tempVertical = 0;
			tempHorizontal = size[0];
			tempVertical = size[1];
			if (size[0] < size[1]) {
				tempHorizontal = size[1];
				tempVertical = size[0];
			}
			if (horizontal < tempHorizontal) {
				horizontal = tempHorizontal;
			}
			if (vertical < tempVertical) {
				vertical = tempVertical;
			}
		}

		answer = horizontal * vertical;
		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		System.out.println(s.solution(sizes));
	}
}
