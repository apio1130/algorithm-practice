package com.algorithm.baekjoon.pb15596;

/**
 * 정수 N개의 합
 */
class Test {
    public long sum(int[] a) {
        return sum(a, 0);
    }

    private long sum(int[] a, int idx) {
        if (a.length - 1 == idx) {
            return a[idx];
        }
        return a[idx] + sum(a, ++idx);
    }
}
