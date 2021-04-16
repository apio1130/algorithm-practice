package com.algorithm.baekjoon.pb5543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 상근날드
 */
class Main {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bugger = Integer.MAX_VALUE;
        int drink = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            int input = Integer.parseInt(br.readLine());
            bugger = Math.min(bugger, input);
        }
        for (int i = 0; i < 2; i++) {
            int input = Integer.parseInt(br.readLine());
            drink = Math.min(drink, input);
        }
        System.out.println(bugger + drink - 50);
    }
}
