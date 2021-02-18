package com.algorithm.programmers.lessons12912;

import java.util.stream.LongStream;

class Solution {
    public long solution(int a, int b) {
        if (a == b) {
            return a;
        }
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return LongStream.range(min, max + 1).sum();
    }
}
