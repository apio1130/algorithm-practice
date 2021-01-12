package com.algorithm.baekjoon.pb2338;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * 긴자리 계산
 *
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BigInteger a = new BigInteger(br.readLine()); 
        BigInteger b = new BigInteger(br.readLine()); 
        sb.append(a.add(b)).append(System.lineSeparator()).append(a.subtract(b)).append(System.lineSeparator()).append(a.multiply(b));
        System.out.println(sb.toString());
    }

}
