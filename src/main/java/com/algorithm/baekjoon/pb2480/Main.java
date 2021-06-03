package com.algorithm.baekjoon.pb2480;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * problem2480 주사위 세개
 */
class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] selectedDice = new int[7];
		int max = 0;
		for (int i = 0; i < 3; i++) {
			int num = Integer.parseInt(st.nextToken());
			selectedDice[num]++;
			if (num > max) {
				max = num;
			}
		}

		int result = max * 100;
		for (int i = 1; i < selectedDice.length; i++) {
			int count = selectedDice[i];
			if (count == 3) {
				result = 10000 + i * 1000;
				break;
			} else if (count == 2) {
				result = 1000 + i * 100;
				break;
			}
		}
		System.out.println(result);
	}
}
