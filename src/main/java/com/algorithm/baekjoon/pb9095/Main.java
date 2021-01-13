package com.algorithm.baekjoon.pb9095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1, 2, 3 더하기
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] numArr = new int[t];
        for (int i = 0; i < t; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int count = findCombination(numArr[i]);
            sb.append(count).append(System.lineSeparator());
        }

        System.out.print(sb.toString());
    }

    private static int findCombination(int num) {
        if (num == 3) {
            return 4;
        } else if (num == 2) {
            return 2;
        } else if (num == 1) {
            return 1;
        } else if (num == 0) {
            return 0;
        } else {
            return findCombination(num - 1) + findCombination(num - 2) + findCombination(num - 3);
        }
    }
}
