package com.algorithm.baekjoon.pb2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 오븐 시계
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern p = Pattern.compile(" ");
        int[] now = Arrays.stream(p.split(br.readLine())).mapToInt(Integer::parseInt).toArray();
        int time = Integer.parseInt(br.readLine());
        int carry = 0;
        int mm = now[1] + time;
        if (mm > 59) {
            carry = mm / 60;
            mm = mm % 60;
        }
        now[1] = mm;
        if (carry > 0) {
            now[0] += carry;
        }
        if (now[0] > 23) {
            now[0] = now[0] % 24;
        }

        System.out.println(now[0] + " " + now[1]);
    }
}
