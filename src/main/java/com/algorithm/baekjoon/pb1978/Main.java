package com.algorithm.baekjoon.pb1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 소수 찾기
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        for (int num : numbs) {
            if (num > 1)
                count += check(num);
        }
        System.out.println(count);

        br.close();
    }

    private static int check(int num) {
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
