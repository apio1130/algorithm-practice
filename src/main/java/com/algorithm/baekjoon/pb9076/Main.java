package com.algorithm.baekjoon.pb9076;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 점수 집계
 */
class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
			if (nums[3] - nums[1] >= 4) {
				System.out.println("KIN");
			} else {
				System.out.println(nums[1] + nums[2] + nums[3]);
			}
		}
	}
}
