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
        for (int i = 0; i < count; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
            if (inputs[i] == 0) {
                int j = i - 1;
                while (true) {
                    if (inputs[j] != 0) {
                        inputs[j] = 0;
                        break;
                    } else {
                        j--;
                    }
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += inputs[i];
        }
        System.out.println(sum);
    }
}
