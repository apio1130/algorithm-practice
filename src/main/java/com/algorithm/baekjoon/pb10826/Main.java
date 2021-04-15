package com.algorithm.baekjoon.pb10826;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * 피보나치 수 4
 */
class Main {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        BigInteger result = input < 2 ? BigInteger.valueOf(input) : calc(input);
        System.out.println(result);
    }

    private static BigInteger calc(int input) {
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        int start = 2;
        while (start < input) {
            BigInteger temp = a.add(b);
            a = b;
            b = temp;
            start++;
        }
        return a.add(b);
    }
}
