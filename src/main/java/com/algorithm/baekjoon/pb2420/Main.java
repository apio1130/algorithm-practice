package com.algorithm.baekjoon.pb2420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 사파리월드
 */
class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long[] nums = new long[2];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Long.parseLong(st.nextToken());
		}
		System.out.println(nums[0] > nums[1] ? Math.abs(nums[0] - nums[1]) : Math.abs(nums[1] - nums[0]));
	}
}
