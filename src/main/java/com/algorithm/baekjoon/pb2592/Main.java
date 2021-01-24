package com.algorithm.baekjoon.pb2592;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 대표값
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numArr = new int[10];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }
        int avg = getAvg(numArr);
        int mode = getMode(numArr);

        System.out.println(avg);
        System.out.println(mode);
    }

    private static int getMode(int[] numArr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int key : numArr) {
            int value = countMap.getOrDefault(key, 0);
            countMap.put(key, value + 1);
        }
        int max = 0;
        int result = 0;
        for (int key : countMap.keySet()) {
            int count = countMap.get(key);
            if (count > max) {
                max = count;
                result = key;
            }
        }
        return result;
    }

    private static int getAvg(int[] numArr) {
        int sum = 0;
        for (int j : numArr) {
            sum += j;
        }
        return sum / 10;
    }
}
