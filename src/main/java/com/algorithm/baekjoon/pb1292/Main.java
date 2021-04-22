package com.algorithm.baekjoon.pb1292;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 쉽게 푸는 문제
 */
class Main {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputs = br.readLine();
        int[] arr = Arrays.stream(inputs.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nums = new int[arr[0] + arr[1]];

        int start = 1;
        for (int i = 0; i < nums.length; ) {
            for (int j = 0; j < start; j++) {
                if (i >= nums.length) {
                    break;
                }
                nums[i++] = start;
            }
            start++;
        }
        int sum = 0;
        for (int i = arr[0] - 1; i < nums.length - arr[0]; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
    }
}
