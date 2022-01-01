package com.algorithm.leetcode.base7;

/**
 * 504. Base 7
 */
class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        int temp = num;
        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            temp *= -1;
        }

        StringBuilder sb = new StringBuilder();
        while (temp > 0) {
            sb.append(temp % 7);
            temp /= 7;
        }

        String value = sb.reverse().toString();
        return isNegative ? "-".concat(value) : value;
    }
}
