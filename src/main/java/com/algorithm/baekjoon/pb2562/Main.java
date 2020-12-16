package com.algorithm.baekjoon.pb2562;

import java.util.Scanner;

/**
 * 최댓값
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputSize = 9;
        int[] inputs = new int[inputSize];
        for (int i = 0; i < inputSize; i++) {
            int temp = Integer.parseInt(sc.nextLine());
            inputs[i] = temp;
        }
        int max = -1;
        int maxIdx = -1;

        for (int i = 0; i < inputs.length; i++) {
            if (max < inputs[i]) {
                max = inputs[i];
                maxIdx = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(maxIdx);
    }
}
