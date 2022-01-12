package com.algorithm.leetcode.maximum69number;

/**
 * 1323. Maximum 69 Number
 */
class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        if (!s.contains("6")) {
            return num;
        }

        char[] sArr = s.toCharArray();
        String max = s;
        for (int i = 0; i < s.length(); i++) {
            if (sArr[i] == '6') {
                sArr[i] = '9';
                if (String.valueOf(sArr).compareTo(max) > 0) {
                    max = String.valueOf(sArr);
                }
                sArr[i] = '6';
            }
        }
        
        return Integer.parseInt(max);
    }
}
