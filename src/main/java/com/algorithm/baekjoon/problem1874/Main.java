package com.algorithm.baekjoon.problem1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

/**
 * 스택 수열
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> before = new Stack<>();
        Stack<Integer> after = new Stack<>();

        Integer[] inputArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            inputArr[i] = Integer.parseInt(br.readLine());
        }

        int idx = 0;
        int temp = inputArr[idx];
        for (int i = 1; i <= n; i++) {
            sb.append("+").append(System.lineSeparator());
            before.push(i);
            if (before.peek() == temp) {
                sb.append("-").append(System.lineSeparator());
                after.push(before.pop());
                if (inputArr.length == (idx + 1)) {
                    break;
                }
                temp = inputArr[++idx];

                while (!before.isEmpty()) {
                    if (i < temp) {
                        break;
                    } else {
                        int top = before.peek();
                        for (int j = top; j > temp; j--) {
                            sb.append("-").append(System.lineSeparator());
                        }
                        sb.append("-").append(System.lineSeparator());
                        after.push(before.pop());
                        if (inputArr.length == (idx + 1)) {
                            break;
                        }
                        temp = inputArr[++idx];
                    }
                }
            }
        }

        if (Arrays.equals(inputArr, after.toArray())) {
            System.out.print(sb.substring(0, sb.length() - 1));
        } else {
            System.out.println("NO");
        }

    }
}
