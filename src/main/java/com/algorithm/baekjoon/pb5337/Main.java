package com.algorithm.baekjoon.pb5337;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 웰컴
 */
class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append(".  .   .").append(System.lineSeparator())
			.append("|  | _ | _. _ ._ _  _").append(System.lineSeparator())
			.append("|/\\|(/.|(_.(_)[ | )(/.");
		System.out.println(sb.toString());
	}
}
