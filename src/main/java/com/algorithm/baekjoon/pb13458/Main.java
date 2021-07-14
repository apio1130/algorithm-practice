package com.algorithm.baekjoon.pb13458;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 시험 감독
 */
class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		String[] temp = br.readLine().split(" ");
		int b = Integer.parseInt(temp[0]);
		int c = Integer.parseInt(temp[1]);

		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			int target = a[i] - b;
			cnt++;
			while (target > 0) {
				target -= c;
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}
