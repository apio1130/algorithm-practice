package com.algorithm.baekjoon.pb2446;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 별 찍기 - 9
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String result = printStar(n);
        System.out.println(result);
    }

    private static String printStar(int n) {
        StringBuilder topSb = new StringBuilder();
        StringBuilder bottomSb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            String topSpace = " ".repeat(i - 1);
            String topStart = "*".repeat(2 * (n - i) + 1);
            topSb.append(topSpace).append(topStart).append(System.lineSeparator());
            if (i > 1) {
                String bottomSpace = " ".repeat(n - i);
                String bottomStart = "*".repeat(2 * i - 1);
                bottomSb.append(bottomSpace).append(bottomStart).append(System.lineSeparator());
            }
        }

        if (bottomSb.length() > 0) {
            topSb.append(bottomSb.toString());
        }

        return topSb.toString();
    }
}
