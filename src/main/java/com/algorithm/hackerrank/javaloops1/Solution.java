package com.algorithm.hackerrank.javaloops1;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * <h4>Java Loops I</h4>
 * <pre>
 * Sample Input
 * 2
 * 
 * Sample Output
 * 2 x 1 = 2
 * 2 x 2 = 4
 * 2 x 3 = 6
 * 2 x 4 = 8
 * 2 x 5 = 10
 * 2 x 6 = 12
 * 2 x 7 = 14
 * 2 x 8 = 16
 * 2 x 9 = 18
 * 2 x 10 = 20
 *
 * </pre>
 */
class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		IntStream.range(1, 11).forEach(i -> System.out.println(N + " x " + i + " = " + (N * i)));
		scanner.close();
	}
}
