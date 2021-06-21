package com.algorithm.programmers.lessons12948;

/**
 * 핸드폰 번호 가리기
 */
class Solution {
    public String solution(String phone_number) {
        String answer = "";

        int length = phone_number.length();
        StringBuilder sb = new StringBuilder();
        sb.append("*".repeat(length - 4)).append(phone_number.substring(length - 4));
        answer = sb.toString();

        return answer;
    }
}