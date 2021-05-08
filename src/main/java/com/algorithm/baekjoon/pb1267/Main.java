package com.algorithm.baekjoon.pb1267;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 핸드폰 요금
 */
class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int y = 0; // 30 - 10
		int m = 0; // 60 - 15

		for (int i = 0; i < n; i++) {
			double temp = Double.parseDouble(st.nextToken());
			y += Math.ceil((temp + 1) / 30) * 10;
			m += Math.ceil((temp + 1) / 60) * 15;
		}

		if (y == m) {
			System.out.printf("Y M %d\n", y);
		} else if (y < m) {
			System.out.printf("Y %d\n", y);
		} else {
			System.out.printf("M %d\n", m);
		}
	}
}
