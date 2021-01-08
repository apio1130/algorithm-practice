package com.algorithm.baekjoon.pb2566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 최댓값
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] nums = new int[9][9];
        Pattern p = Pattern.compile(" ");
        for (int i = 0; i < 9; i++) {
            nums[i] = Arrays.stream(p.split(br.readLine())).mapToInt(Integer::parseInt).toArray();
        }
        String result = findMaxNumb(nums);
        System.out.println(result);
    }

    private static String findMaxNumb(int[][] nums) {
        StringBuilder sb = new StringBuilder();
        int max = -1;
        int x = 0;
        int y = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int temp = nums[i][j];
                if (max < temp) {
                    max = temp;
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        return sb.append(max).append(System.lineSeparator()).append(x).append(" ").append(y).toString();
    }
}
