package com.algorithm.programmers.lessons42746;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 가장 큰 수
 */
class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        String[] numbs = Arrays.stream(numbers).mapToObj(Integer::toString).collect(Collectors.toList()).toArray(new String[numbers.length]);
        Arrays.sort(numbs, (o1, o2) -> o2.concat(o1).compareTo(o1.concat(o2)));
        answer = String.join("", numbs);
        if (answer.startsWith("0")) {
            answer = "0";
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(solution.solution(nums));
    }
}