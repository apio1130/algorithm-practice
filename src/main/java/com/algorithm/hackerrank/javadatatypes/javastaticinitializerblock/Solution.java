package com.algorithm.hackerrank.javadatatypes.javastaticinitializerblock;

import java.util.Scanner;

/**
 * Java Static Initializer Block
 *
 */
public class Solution {

	// Write your code here
	static int B;
	static int H;
	static boolean flag;
	static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		if (B > 0 && H > 0) {
			flag = true;
		} else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of class
