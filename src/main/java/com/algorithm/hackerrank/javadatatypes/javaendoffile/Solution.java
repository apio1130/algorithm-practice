package com.algorithm.hackerrank.javadatatypes.javaendoffile;

import java.util.Scanner;


/**
 * Java End-of-file
 *
 */
class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int lineNumber = 0;
		while (sc.hasNext()) {
			String text = sc.nextLine();
			System.out.println(String.format("%d %s", ++lineNumber, text));
		}
    	
    }
}

