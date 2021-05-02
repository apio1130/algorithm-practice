package com.algorithm.baekjoon.pb2845;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;

/**
 * 파티가 끝나고 난 뒤
 */
class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).reduce((a,b) -> a*b).getAsInt();
		Optional<String> result = Arrays.stream(br.readLine().split(" ")).map(i -> String.valueOf((Integer.parseInt(i) - count))).reduce((a, b) -> a.concat(" ").concat(b));
		System.out.println(result.get());
	}
}
