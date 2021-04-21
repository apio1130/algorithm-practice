package com.algorithm.baekjoon.pb1568;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 새
 */
class Main {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int time = 0;

        int idx = 0;
        while (n > 0) {
            idx++;
            if (n < idx) {
                idx = 1;
            }
            n -= idx;
            time++;
        }

        System.out.println(time);
    }
}
