package com.algorithm.baekjoon.pb2740;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 행렬 곱셈
 */
class Main {
	public static void main(String... args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		st = new StringTokenizer(br.readLine());
		st.nextToken();
		int k = Integer.parseInt(st.nextToken());
		int[][] b = new int[m][k];
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < k; j++) {
				b[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		StringBuilder sb = new StringBuilder();
		if (!(n == 0 || m == 0 ||k == 0)) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < k; j++) {
					int sum = 0;
					for (int l = 0; l < m; l++) {
						sum += a[i][l] * b[l][j];
					}
					if (j != 0) {
						sb.append(" ");
					}
					sb.append(sum);
					if (j + 1 == k) {
						sb.append("\n");
					}
				}
			}
		}
		System.out.print(sb);
	}
}
