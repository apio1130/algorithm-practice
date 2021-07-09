package com.algorithm.baekjoon.pb14915;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;

/**
 * 진수 변환기
 */
class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int target = nums[0];
		int radix = nums[1];

		System.out.println(Integer.toString(target, radix).toUpperCase(Locale.ROOT));
	}
}
