package com.algorithm.baekjoon.pb1085;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 직사각형에서 탈출
 */
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] inputArr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = 1001;
        for (int i = 0; i < 2; i++) {
            if (min > (inputArr[i])) {
                min = inputArr[i];
            }
            if (min > (inputArr[2 + i] - inputArr[i])) {
                min = inputArr[2 + i] - inputArr[i];
            }
        }
        System.out.println(min);
    }

}
