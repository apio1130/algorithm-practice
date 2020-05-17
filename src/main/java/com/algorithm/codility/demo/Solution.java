package com.algorithm.codility.demo;

import java.util.stream.IntStream;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 1;

        int[] distinctA = IntStream.of(A).distinct().sorted().toArray();

        for (int i = 0; i < distinctA.length; i++) {
            int temp = distinctA[i];
            if (result == distinctA[i]) {
                result++;
            } else {
                return temp;
            }
        }

        return result;
    }
}