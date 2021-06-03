package com.algorithm.baekjoon.pb2480;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * problem 2480 주사위 세개
 */
class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] nums = new int[3];
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		int result = getMoney(nums, max);
		System.out.println(result);
	}

	private static int getMoney(int[] nums, int max) {
		if (nums[0] == nums[1] && nums[0] == nums[2]) {
			return nums[0] * 1000 + 10000;
		} else if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
			int temp = nums[0] == nums[1] ? nums[0] : nums[2];
			return 1000 + temp * 100;
		} else {
			return max * 100;
		}
	}
}
