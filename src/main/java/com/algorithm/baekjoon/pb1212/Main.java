package com.algorithm.baekjoon.pb1212;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 8진수 2진수
 */
class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String octal = br.readLine();
		if ("0".equals(octal)) {
			System.out.println(octal);
		} else {

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < octal.length(); i++) {
				int[] numArr = new int[3];
				int temp = Integer.parseInt(octal.substring(i, i + 1));
				int idx = 2;
				while (temp > 0) {
					numArr[idx--] = temp % 2;
					temp /= 2;
				}
				sb.append(numArr[0]).append(numArr[1]).append(numArr[2]);
			}
			int startIdx = 0;
			for (int i = 0; i < sb.length(); i++) {
				if (sb.charAt(i) != '0') {
					break;
				} else {
					startIdx++;
				}
			}
			System.out.println(sb.toString().substring(startIdx));
		}
	}
}
