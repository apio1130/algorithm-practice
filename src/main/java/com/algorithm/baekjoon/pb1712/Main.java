package com.algorithm.baekjoon.pb1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 손익분기점
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        long profit = c - b;
        if (profit <= 0) {
            System.out.println(-1);
        } else {
            int count = (int)(a / profit + 1);
            System.out.println(count);
        }
    }
}
