package com.algorithm.baekjoon.pb5524;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 입실 관리
 */
public class Main {

	public static void main(String... args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		for (int i = 0; i < count; i++) {
			System.out.println(br.readLine().toLowerCase());
		}
	}
}
