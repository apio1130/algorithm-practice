package com.algorithm.baekjoon.pb2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 블랙잭
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        String cards = br.readLine();
        int[] nums = Arrays.stream(cards.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int max = 0;

        repeat:
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == m) {
                        max = sum;
                        break repeat;
                    }

                    if (sum > max && sum <= m) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
