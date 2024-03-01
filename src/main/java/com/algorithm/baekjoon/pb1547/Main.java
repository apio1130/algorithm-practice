package com.algorithm.baekjoon.pb1547;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 공
 */
public class Main {
	public static void main(String... args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ball = 1;
		for (int i = 0; i < n; i++) {
			String input =  br.readLine();
			if (input.contains(String.valueOf(ball))) {
				Integer sum = Arrays.stream(input.split(" ")).map(Integer::parseInt).reduce(Integer::sum).get();
				ball = sum - ball;
			}
		}
		System.out.println(ball);
	}
}
