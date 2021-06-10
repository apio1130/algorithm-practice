package com.algorithm.baekjoon.pb2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 수 정렬하기 2
 */
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		boolean[] arr = new boolean[2000001];

		for (int i = 0; i < n; i++) {
			arr[Integer.parseInt(br.readLine()) + 1000000] = true;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]) {
				sb.append(i - 1000000).append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}
