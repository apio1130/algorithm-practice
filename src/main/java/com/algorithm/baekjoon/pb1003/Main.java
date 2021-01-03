package com.algorithm.baekjoon.pb1003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 피보나치 함수
 */
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        int[] numArr = new int[T];
        int max = 0;
        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(bf.readLine());
            numArr[i] = num;
            if (max < num) {
                max = num;
            }
        }

        Map<Integer, String> values = new HashMap<>();
        int zero = 1;
        int one = 0;
        for (int i = 0; i <= max; i++) {
            values.put(i, zero + " " + one);
            int temp = one;
            one = zero + one;
            zero = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            sb.append(values.get(numArr[i])).append(System.lineSeparator());
        }

        System.out.printf("%s", sb.toString());
    }
}
