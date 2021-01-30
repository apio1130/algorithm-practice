package com.algorithm.baekjoon.pb2445;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 별 찍기 - 8
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String result = printStar(n);
        System.out.println(result);
    }

    private static String printStar(int n) {
        StringBuilder top = new StringBuilder();
        StringBuilder bottom = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            String topStar = "*".repeat(i);
            String topSpace = " ".repeat(2 * (n - i));
            top.append(topStar).append(topSpace).append(topStar).append(System.lineSeparator());
            if (i < n) {
                String bottomStar = "*".repeat(n - i);
                String bottomSpace = " ".repeat(2 * i);
                bottom.append(bottomStar).append(bottomSpace).append(bottomStar).append(System.lineSeparator());
            }
        }
        if (bottom.length() > 0) {
            top.append(bottom.toString());
        }

        return top.toString();
    }
}
