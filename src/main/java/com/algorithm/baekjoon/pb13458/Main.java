package com.algorithm.baekjoon.pb13458;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 시험 감독
 */
class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		String[] temp = br.readLine().split(" ");
		int b = Integer.parseInt(temp[0]);
		int c = Integer.parseInt(temp[1]);

		long cnt = 0;
		for (int t : a) {
			cnt += t < b ? 1 : 1 + Math.ceil((double)(t - b) / c);
		}

		System.out.println(cnt);
	}
}
