package com.algorithm.baekjoon.pb1075;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 나누기
 */
class Main {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        long start =  Long.parseLong(n.substring(0, n.length() - 2).concat("00"));
        int f = Integer.parseInt(br.readLine());
        if (start % f == 0) {
            System.out.println("00");
        } else {
            int mod = (int)(f - (start % f));
            String result = mod < 10 ? "0" + mod : String.valueOf(mod);
            System.out.println(result);
        }
    }

    private static String print(int mod) {
        return mod < 10 ? "0" + mod : String.valueOf(mod);
    }
}
