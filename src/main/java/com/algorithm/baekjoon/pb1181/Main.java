package com.algorithm.baekjoon.pb1181;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 단어 정렬
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < input; i++) {
            String text = sc.nextLine();
            list.add(text);
        }

        list.stream().distinct().sorted((a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            } else {
                return a.length() - b.length();
            }
        }).forEach(System.out::println);
    }
}
