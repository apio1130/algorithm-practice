package com.algorithm.baekjoon.pb5554;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 심부름 가는 길
 */
class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 4;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		int m = sum / 60;
		int s = sum - m * 60;
		System.out.println(m);
		System.out.println(s);
	}
}
