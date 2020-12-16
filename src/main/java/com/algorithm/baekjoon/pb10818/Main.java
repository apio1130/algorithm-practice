package com.algorithm.baekjoon.pb10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 최소, 최대
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int min = 1000001;
        int max = -1000001;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println(min + " " + max);
    }
}