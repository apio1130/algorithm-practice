package com.algorithm.baekjoon.pb9085;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 더하기
 */
class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			br.readLine();
			int sum = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum();
			System.out.println(sum);
		}
	}
}
