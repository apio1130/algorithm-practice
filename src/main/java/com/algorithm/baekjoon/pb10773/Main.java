package com.algorithm.baekjoon.pb10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 제로
 */
class Main {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] inputs = new int[count];

        int sum = 0;
        int idx = 0;
        for (int i = 0; i < count; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp == 0) {
                sum -= inputs[--idx];
                inputs[idx] = temp;
            } else {
                inputs[idx++] = temp;
                sum += temp;
            }
        }

        System.out.println(sum);
    }
}
