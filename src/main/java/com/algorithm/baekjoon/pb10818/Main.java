package com.algorithm.baekjoon.pb10818;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * 최소, 최대
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputSize = Integer.parseInt(sc.nextLine());
        String inputTxt = sc.nextLine();
        int[] inputs = Arrays.stream(inputTxt.split(" ")).mapToInt(Integer::parseInt).toArray();
        Supplier<IntStream> supplier = () -> Arrays.stream(inputTxt.split(" ")).mapToInt(Integer::parseInt);
        int min = supplier.get().min().orElse(-1000000);
        int max = supplier.get().max().orElse(1000000);

        System.out.println(min);
        System.out.println(max);
    }
}
