package com.algorithm.baekjoon.pb1252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * 이진수 덧셈
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern p = Pattern.compile(" ");
        String[] inputs = p.split(br.readLine());

        String a;
        String b;
        int diff;
        if (inputs[0].length() > inputs[1].length()) {
            a = inputs[0];
            b = inputs[1];
            diff = inputs[0].length() - inputs[1].length();
        } else {
            a = inputs[1];
            b = inputs[0];
            diff = inputs[1].length() - inputs[0].length();
        }
        if (diff > 0) {
            b = appendZero(b, diff);
        }
        int maxLength = a.length();
        int carry = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = maxLength - 1; i >= 0; i--) {
            int temp = (a.charAt(i) - '0') + (b.charAt(i) - '0') + carry;
            carry = temp > 1 ? 1 : 0;
            sb.append(temp % 2);
        }
        if (carry == 1) {
            sb.append(carry);
        }

        String result = sb.reverse().toString();
        System.out.print(result.contains("1") ? result.substring(result.indexOf("1")) : "0");
    }

    private static String appendZero(String b, int diff) {
        return "0".repeat(diff) + b;
    }
}
