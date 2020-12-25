package com.algorithm.baekjoon.pb1158;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 요세푸스 문제
 */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = Integer.parseInt(input.split(" ")[0]);
        int k = Integer.parseInt(input.split(" ")[1]);
        Queue<Integer> list = IntStream.range(1, n + 1).boxed().collect(Collectors.toCollection(LinkedList::new));
        if (list.size() < k) {
            System.out.printf("%s", print(list));
        } else {
            Queue<Integer> result = new LinkedList<>();
            process(list, result, k);

            System.out.printf("%s", print(result));
        }
    }

    private static void process(Queue<Integer> list, Queue<Integer> result, int k) {
        if (list.isEmpty()) {
            return;
        }
        for (int i = 1; i <= k; i++) {
            if (i != k) {
                list.offer(list.poll());
            } else {
                result.offer(list.poll());
            }
        }
        process(list, result, k);
    }

    private static String print(Queue<?> list) {
        StringBuilder sb = new StringBuilder();
        String temp = list.stream().map(String::valueOf).collect(Collectors.joining(", "));
        sb.append("<");
        sb.append(temp);
        sb.append(">");
        return sb.toString();
    }
}