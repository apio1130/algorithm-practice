package com.algorithm.baekjoon.pb15969;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  Problem 15969 : 행복
 */
class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] points = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int max = points[n-1];
        int min = points[0];
        System.out.println(max - min);
    }
}