package com.algorithm.baekjoon.pb10953;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A+B - 6
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        int caseCount = 0;
        if (input != null) {
            caseCount = Integer.parseInt(input);
        }

        for (int i = 0; i < caseCount; i++) {
            String numbers = br.readLine();
            String[] numbArr = numbers.split(",");
            int sum = Integer.parseInt(numbArr[0]) + Integer.parseInt(numbArr[1]);
            sb.append(sum);
            if (caseCount != (i + 1)) {
                sb.append(System.lineSeparator());
            }
        }

        System.out.printf("%s", sb.toString());
    }
}
