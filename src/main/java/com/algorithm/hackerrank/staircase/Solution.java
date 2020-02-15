package com.algorithm.hackerrank.staircase;

import java.util.Scanner;

/**
 * Staircase
 *
 */
class Solution {

	// Complete the staircase function below.
	static void staircase(int n) {
		final String PRINT_CHAR = "#";
		final String PRINT_SPCAE = " ";
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 1; j--) {
				sb.append(PRINT_SPCAE);
			}
			for (int j = 0; j < i + 1; j++) {
				sb.append(PRINT_CHAR);
			}
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		staircase(n);

		scanner.close();
	}
}
