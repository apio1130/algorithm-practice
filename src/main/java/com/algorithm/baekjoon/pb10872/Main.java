package com.algorithm.baekjoon.pb10872;

import java.util.Scanner;

/**
 * 팩토리얼
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int num = Integer.parseInt(input);
        long result = factorial(num);
        System.out.println(result);
    }

    private static long factorial(int num) {
        if (num < 2) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
