package com.algorithm.baekjoon.pb1373;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2진수 8진수
 */
public class Main {
	public static void main(String... args) throws IOException {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		String input = rd.readLine();
		char[] arr = input.toCharArray();
		int length = input.length();
		StringBuilder sb = new StringBuilder();
		int mod = 0;
		int multiple = 1;
		int value = 0;
		for (int i = length -1; i >= 0; i--) {
			value += (arr[i] - '0') * multiple;
			multiple *= 2;
			mod++;
			if (mod % 3 == 0) {
				sb.append(value);
				value = 0;
				mod = 0;
				multiple = 1;
			}
		}
		if (mod > 0) {
			sb.append(value);
		}

		System.out.println(sb.reverse());
	}
}
