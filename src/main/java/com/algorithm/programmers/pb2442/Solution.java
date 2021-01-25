package com.algorithm.programmers.pb2442;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 별 찍기 - 5
 *
 */
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(" ".repeat(n-i))
              .append("*".repeat(i * 3))
              .append(System.lineSeparator());
        }
        System.out.println(sb.toString());
    }
}
