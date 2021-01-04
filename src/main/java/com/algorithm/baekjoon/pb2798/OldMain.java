package com.algorithm.baekjoon.pb2798;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * 블랙잭
 */
class OldMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputNM = sc.nextLine().split(" ");
        int N = Integer.parseInt(inputNM[0]);
        int M = Integer.parseInt(inputNM[1]);

        String cardText = sc.nextLine();
        int[] cards = Arrays.stream(cardText.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < cards.length - 2; i++) {
            int first = cards[i];
            for (int j = i + 1; j < cards.length - 1; j++) {
                int secd = cards[j];
                for (int k = j + 1; k < cards.length; k++) {
                    int thrd = cards[k];
                    int sum = first + secd + thrd;
                    int temp = stack.size() == 0 ? 0 : stack.peek();
                    if (sum <= M && sum > temp) {
                        stack.push(sum);
                    }
                }
            }
        }
        System.out.println(stack.pop());
    }
}
