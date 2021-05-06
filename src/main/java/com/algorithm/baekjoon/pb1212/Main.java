package com.algorithm.baekjoon.pb1212;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 8진수 2진수
 */
class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine(), 8);
		StringBuilder sb = new StringBuilder();
		while (input > 0) {
			int mod = input % 2;
			input /= 2;
			sb.append(mod);
		}
		sb.reverse();
		String result = sb.toString().charAt(0) == 0 ? sb.toString().substring(1) : sb.toString();
		System.out.println(result);
	}
}
