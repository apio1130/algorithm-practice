package com.algorithm.baekjoon.pb3052;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 나머지
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputSize = 10;
        final int TARGET_NUM = 42;
        int[] inputs = new int[inputSize];

        for (int i = 0; i < inputSize; i++) {
            int temp = Integer.parseInt(sc.nextLine());
            inputs[i] = temp;
        }

        System.out.println(IntStream.of(inputs).map(i -> i % TARGET_NUM).distinct().count());
    }
}
