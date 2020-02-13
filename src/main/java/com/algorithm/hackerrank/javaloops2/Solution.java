package com.algorithm.hackerrank.javaloops2;

import java.util.Scanner;

/**
 * Java Loops II
 *
 */
class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			System.out.println(calculate(a, b, n));
		}
		in.close();
	}

	private static String calculate(int a, int b, int n) {
		StringBuilder sb = new StringBuilder();
		int sum = a;

		for (int i = 0; i < n; i++) {
			sum += b * (1 << i);
			if (i > 0) {
				sb.append(" ");
			}
			sb.append(sum);
		}

		return sb.toString();
	}
}
