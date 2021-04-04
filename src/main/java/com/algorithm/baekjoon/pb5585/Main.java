package com.algorithm.baekjoon.pb5585;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 거스름돈
 */
class Main {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int received = Integer.parseInt(br.readLine());
        int mod = 1000 - received;
        int coinCount = 0;
        while (mod > 0) {
            if (mod / 500 > 0) {
                coinCount += mod / 500;
                mod = mod % 500;
            } else if (mod / 100 > 0) {
                coinCount += mod / 100;
                mod = mod % 100;
            } else if (mod / 50 > 0) {
                coinCount += mod / 50;
                mod = mod % 50;
            } else if (mod / 10 > 0) {
                coinCount += mod / 10;
                mod = mod % 10;
            } else if (mod / 5 > 0) {
                coinCount += mod / 5;
                mod = mod % 5;
            } else {
                coinCount += mod;
                break;
            }
        }
        System.out.println(coinCount);
    }
}
