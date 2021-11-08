package com.algorithm.programmers.lessons12949;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 행렬의 곱셈
 */
class Solution {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int a = arr1.length;
		int b = arr2[0].length;
		int[][] answer = new int[a][b];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				int temp = 0;
				for (int k = 0; k < arr1[0].length; k++) {
					temp += arr1[i][k] * arr2[k][j];
				}
				answer[i][j] = temp;
			}
		}

		return answer;
	}

	public static void main(String... args) {
		Solution s = new Solution();
		// int[][] arr1 = {{2, 3, 2},
		// 				{4, 2, 4},
		// 				{3, 1, 4}};
		// int[][] arr2 = {{5, 4, 3},
		// 				{2, 4, 1},
		// 				{3, 1, 1}};
		int[][] arr1 = {{1,2,3},
						{4,5,6}};
		int[][] arr2 = {{1,4},
						{2,5},
						{3,6}};
		int[][] solution = s.solution(arr1, arr2);
		Stream.of(solution).forEach(l ->
			System.out.println(Arrays.toString(l))
		);
	}
}
