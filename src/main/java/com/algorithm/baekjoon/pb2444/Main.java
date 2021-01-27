package com.algorithm.baekjoon.pb2444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 별 찍기 - 7
 *
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringBuilder reverseSb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.append(" ".repeat(n - i)).append("*".repeat(2 * i - 1)).append(System.lineSeparator());
            if (i < n) {
                reverseSb.append(" ".repeat(i)).append("*".repeat(2 * (n - i) - 1)).append(System.lineSeparator());
            }
        }
        if (reverseSb.length() > 0) {
            sb.append(reverseSb.toString());
        }

        System.out.println(sb.toString());
    }
}
