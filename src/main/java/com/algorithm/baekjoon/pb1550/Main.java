package com.algorithm.baekjoon.pb1550;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 16진수
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int result = Integer.parseInt(input, 16);
        System.out.println(result);
    }
}
