package com.algorithm.baekjoon.pb1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * 최소공배수
 * hint : 두수의 곲 = 최대공약수 * 최소공배수
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseCount = Integer.parseInt(br.readLine());

        Pattern p = Pattern.compile(" ");
        for (int i = 0; i < caseCount; i++) {
            String[] inputTxt = p.split(br.readLine());
            int a = Integer.parseInt(inputTxt[0]);
            int b = Integer.parseInt(inputTxt[1]);
            int gcd = gcd(a, b);
            int result = a * b / gcd;
            sb.append(result).append(System.lineSeparator());
        }
        System.out.print(sb.toString());
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
