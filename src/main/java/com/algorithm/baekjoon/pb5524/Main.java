package com.algorithm.baekjoon.pb5524;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * 입실 관리
 */
public class Main {

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		String[] textArr = new String[count];
		for (int i = 0; i < count; i++) {
			textArr[i] = sc.nextLine().toLowerCase();
		}
		Stream.of(textArr).forEach(System.out::println);
	}
}
