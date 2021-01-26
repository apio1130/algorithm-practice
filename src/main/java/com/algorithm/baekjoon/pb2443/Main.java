package com.algorithm.baekjoon.pb2443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 별 찍기 - 6
 *
 */
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            sb.append(" ".repeat(n - i)).append("*".repeat(2 * i - 1)).append(System.lineSeparator());
        }
        System.out.println(sb.toString());
    }
}
