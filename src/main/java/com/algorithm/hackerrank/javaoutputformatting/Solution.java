package com.algorithm.hackerrank.javaoutputformatting;
import java.util.Scanner;

/**
 * 
 * 
 * Test Case
 * 1) input 
 * java 100
 * cpp 65
 * python 50
 * 
 * 2) Expected Output
 * ================================
 * java           100 
 * cpp            065 
 * python         050 
 * ================================
 *
 */
class Solution {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d\n", s1, x);
            }
            System.out.println("================================");

    }
}



