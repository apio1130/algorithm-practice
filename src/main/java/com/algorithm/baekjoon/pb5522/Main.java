package com.algorithm.baekjoon.pb5522;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 카드 게임
 */
class Main {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += Integer.parseInt(br.readLine());
        }
        System.out.println(sum);
    }
}
