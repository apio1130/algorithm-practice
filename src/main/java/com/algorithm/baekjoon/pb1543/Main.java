package com.algorithm.baekjoon.pb1543;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 문서 검색
 */
class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		String target = br.readLine();
		String[] split = text.split(target);
		int splitedSize = text.length() - String.join("", split).length();
		System.out.println(splitedSize / target.length());
	}
}
