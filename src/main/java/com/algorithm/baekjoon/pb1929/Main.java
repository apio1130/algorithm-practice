package com.algorithm.baekjoon.pb1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  소수 구하기
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        boolean[] nonPrimeArr = new boolean[end+1];
        nonPrimeArr[0] = true;
        nonPrimeArr[1] = true;

        for (int i = 2; i < Math.sqrt(end); i++) {
            for (int j = i*i; j <= end; j+=i) {
                nonPrimeArr[j] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            if (!nonPrimeArr[i]) {
                sb.append(i).append("\n");
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }

        System.out.println(sb.toString());
    }
}
