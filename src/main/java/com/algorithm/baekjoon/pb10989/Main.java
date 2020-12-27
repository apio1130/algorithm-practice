package com.algorithm.baekjoon.pb10989;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 수 정렬하기 3
 */
class Main {
    public static void main(String[] args) {
        final int MAX_SIZE = 10000;
        int[] numArr = new int[0];
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int size = Integer.parseInt(br.readLine());
            numArr = new int[MAX_SIZE + 1];
            for (int i = 0; i < size; i++) {
                int num = Integer.parseInt(br.readLine());
                numArr[num]++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            for (int i = 1; i <= MAX_SIZE; i++) {
                if (numArr[i] > 0) {
                    int count = numArr[i];
                    String numbTxt = i + "\n";
                    for (int j = 0; j < count; j++) {
                        bw.write(numbTxt);
                    }
                }
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
