package com.algorithm.hackerrank.javaloops2;

import java.util.Scanner;

class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			System.out.println(calculate(a, b, n, 1));
		}
		in.close();
	}

	private static String calculate(int a, int b, int n, int limit) {
		int sum = 0;
		sum = a + b * (calcBinary(limit));
		
		if (n == limit) {
			return String.valueOf(sum);
		}
		
		return sum + " " + calculate(a, b, n, ++limit);
	}
	
	private static int calcBinary(int n) {
		int sum = 1;
		
		for (int i = 1; i <= n; i++) {
			if (i > 1) {
				sum += 2 << (i - 2);
			}
		}
		
		return sum;
	}
}
