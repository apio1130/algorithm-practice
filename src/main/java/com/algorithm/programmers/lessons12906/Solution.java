package com.algorithm.programmers.lessons12906;

import java.util.LinkedList;
import java.util.List;


/**
 * 같은 숫자는 싫어
 */
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new LinkedList<>();
        if (arr.length > 0) {
            list.add(arr[0]);
        }
        for (int i = 1; i < arr.length; i++) {
            int numb = arr[i];
            if (arr[i-1] != numb) {
                list.add(numb);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
