package com.algorithm.programmers.lessons12969;

import java.util.Scanner;

/**
 * 직사각형 별찍기
 */
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < b; i++) {
			sb.append("*".repeat(a)).append(System.lineSeparator());
		}

		System.out.println(sb.toString());
	}
}
