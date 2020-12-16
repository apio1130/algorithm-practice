package com.algorithm.baekjoon.pb2475;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 검증수
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int result = Arrays.stream(input.split(" ")).mapToInt(s -> {
            int numb = Integer.parseInt(s);
            return numb * numb;
        }).sum() % 10;

        System.out.println(result);
    }
}
