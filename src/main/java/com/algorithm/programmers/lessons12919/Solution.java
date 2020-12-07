package com.algorithm.programmers.lessons12919;

import java.util.Arrays;

/**
 * 서울에서 김서방 찾기
 */
class Solution {
    public String solution(String[] seoul) {
        final String KIM = "Kim";
        int position = Arrays.asList(seoul).indexOf(KIM);
        return String.format("김서방은 %s에 있다", position);
    }
}