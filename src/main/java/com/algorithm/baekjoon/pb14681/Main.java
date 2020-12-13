package com.algorithm.baekjoon.pb14681;

import java.util.Scanner;

/**
 * 사분면 고르기
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int x = Integer.parseInt(s1);
        int y = Integer.parseInt(s2);
        if (x > 0) { // 1 or 4
            System.out.println(y > 0 ? 1 : 4);
        } else { // 2 or 3
            System.out.println(y > 0 ? 2 : 3);
        }
    }
}
