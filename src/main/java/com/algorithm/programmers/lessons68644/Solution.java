package com.algorithm.programmers.lessons68644;

import java.util.HashSet;
import java.util.Set;

/**
 * 두개 뽑아서 더하기
 *
 */
class Solution {

    public int[] solution(int[] numbers) {
        Set<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                numberSet.add(numbers[i] + numbers[j]);
            }
        }
        return numberSet.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

}
