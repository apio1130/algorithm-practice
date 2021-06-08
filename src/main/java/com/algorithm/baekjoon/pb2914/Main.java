package com.algorithm.baekjoon.pb2914;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 저작권
 */
class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");

		int a = Integer.parseInt(inputs[0]);
		int b = Integer.parseInt(inputs[1]);

		int startCnt = a * (b - 1);
		System.out.println(startCnt + 1);
	}
}
