package com.algorithm.hackerrank.minimaxsum;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Mini-Max Sum
 */
public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        IntStream.of(arr).sorted().forEach(System.out::println);
        long mini = IntStream.of(arr).sorted().limit(4).mapToLong(Long::valueOf).sum();
        long max = IntStream.of(arr).sorted().skip(1).mapToLong(Long::valueOf).sum();

        System.out.println(String.format("%d %d", mini, max));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
