package com.algorithm.baekjoon.pb10818;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 최소, 최대
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputSize = Integer.parseInt(sc.nextLine());
        String inputTxt = sc.nextLine();
        int[] inputs = Arrays.stream(inputTxt.split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = inputs[0];
        int min = inputs[0];

        for (int num : inputs) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}