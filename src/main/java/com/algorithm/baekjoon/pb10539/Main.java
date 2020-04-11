package com.algorithm.baekjoon.pb10539;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

/**
 * Problem 10539 : 수빈이와 수열
 */
class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] bArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] aArr = new int[n];

        int sum = 0;
        for (int i = 0; i < bArr.length; i++) {
            int temp = bArr[i];
            int nth = i + 1;
            aArr[i] = temp * nth - sum;
            sum = temp * nth;
        }

        Optional<String> result = Arrays.stream(aArr).boxed().map(i -> i.toString()).reduce((a, b) -> a + " " + b);
        System.out.println(result.get());
    }
}
