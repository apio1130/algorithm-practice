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

		int a = nums[0];
		int b = nums[1];
		int c = nums[2];

		if (a == b && b == c) {
			System.out.println(10000 + a * 1000);
		} else if (a == b || b == c || a == c) {
			int temp = a == b ? a : b;
			System.out.println(1000 + temp * 100);
		} else {
			System.out.println(max * 100);
		}
	}
}
