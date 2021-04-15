package com.algorithm.baekjoon.pb10870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 피보나치 수 5
 */
class Main {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        long result = input < 2 ? input : calc(input);
        System.out.println(result);
    }

    private static long calc(int input) {
        long a = 0;
        long b = 1;
        int start = 2;
        while (start < input) {
            long temp = a + b;
            a = b;
            b = temp;
            start++;
        }
        return a + b;
    }
}
