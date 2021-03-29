package com.algorithm.baekjoon.pb1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 소트인사이드
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String result = Arrays.stream(input.split("")).sorted(Comparator.reverseOrder()).reduce(String::concat).get();
        System.out.println(result);
    }
}
