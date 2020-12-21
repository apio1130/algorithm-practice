package com.algorithm.baekjoon.pb2163;

import java.util.Scanner;

/**
 * 초콜릿 자르기
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] splitTxt = input.split(" ");
        int n = Integer.parseInt(splitTxt[0]);
        int m = Integer.parseInt(splitTxt[1]);

        int result = divide(n * m);
        System.out.println(result);
    }

    private static int divide(int num) {
        if (num == 1) {
            return 0;
        }
        return 1 + divide(num - (num / 2)) + divide(num / 2);
    }
}
