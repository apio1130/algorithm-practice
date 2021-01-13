package com.algorithm.baekjoon.pb2455;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 지능형 기차
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern p = Pattern.compile(" ");
        int maxPeople = 0;
        int currentPeople = 0;
        for(int i = 0; i < 4; i ++) {
            int[] input = Arrays.stream(p.split(br.readLine())).mapToInt(Integer::parseInt).toArray();
            currentPeople -= input[0];
            currentPeople += input[1];
            if (currentPeople > maxPeople) {
                maxPeople = currentPeople;
            }
        }
        System.out.println(maxPeople);
    }
}
