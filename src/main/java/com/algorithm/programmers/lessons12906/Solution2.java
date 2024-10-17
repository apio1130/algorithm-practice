package com.algorithm.programmers.lessons12906;

import java.util.Stack;

/**
 * 같은 숫자는 싫어
 */
class Solution2 {
    public int[] solution(int[] arr) {
        var stack = new Stack<Integer>();
        for (int i : arr) {
            if (stack.empty() || stack.peek() != i) {
                stack.push(i);
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
