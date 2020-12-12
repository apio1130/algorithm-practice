package com.algorithm.programmers.lessons12916;

import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * 문자열 내 p와 y의 개수
 */
class Solution {
    boolean solution(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        Supplier<IntStream> supplier = s::chars;
        return supplier.get().filter(i -> i == 'p' || i == 'P').count() == supplier.get().filter(i -> i == 'y' || i == 'Y').count();
    }
}
