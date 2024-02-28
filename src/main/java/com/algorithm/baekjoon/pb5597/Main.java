package com.algorithm.baekjoon.pb5597;

import java.util.Scanner;

/**
 * 과제 안 내신 분..?
 */
class Main {
	public static void main(String... args) {
		final int maxSubmitCount = 28;
		boolean[] arr = new boolean[31];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < maxSubmitCount; i++) {
			arr[Integer.parseInt(sc.nextLine())] = true;
		}
		int arrPickCount = 0;
		for (int i = 1; i < 31; i++) {
			if (!arr[i]) {
				System.out.println(i);
				arrPickCount++;
			}
			if (arrPickCount == 2) {
				break;
			}
		}
	}
}
