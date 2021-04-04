package com.algorithm.baekjoon.pb1193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 분수찾기
 */
class Main {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        if (input == 1) {
            System.out.println("1/1");
        } else {
            int range = 1;
            int level = 1;
            while (input > range) {
                level++;
                range += level;
            }
            range -= level;
            for (int i = 1; i <= level; i++) {
                if (++range == input) {
                    if (level % 2 == 0) {
                        System.out.printf("%d/%d\n", i, level - i + 1);
                    } else {
                        System.out.printf("%d/%d\n", level - i + 1, i);
                    }
                    break;
                }
            }
        }
    }
}
