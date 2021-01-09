package com.algorithm.baekjoon.pb1009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 분산처리
 */
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        Pattern p = Pattern.compile(" ");
        for (int i = 0; i < testCase; i++) {
            int[] input = Arrays.stream(p.split(br.readLine())).mapToInt(Integer::parseInt).toArray();
            int result = process(input[0], input[1]);
            sb.append(result).append(System.lineSeparator());
        }
        System.out.print(sb.toString());
    }

    private static int process(int a, int b) {
        if (b == 0) {
            return 1;
        }

        List<Integer> list = new LinkedList<>();
        int target = a % 10;
        int temp = target;
        list.add(temp);

        while (true) {
            temp = (temp * a) % 10;
            list.add(temp);
            if (target == temp) {
                break;
            }
        }

        int idx = b % (list.size() - 1);
        int result = idx == 0 ? list.get(list.size() - 2) : list.get(idx - 1);

        return result == 0 ? 10 : result;
    }
}
