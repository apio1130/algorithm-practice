package com.algorithm.leetcode.reformatthestring;

class Solution {
    public String reformat(String s) {
        if (s.length() == 1) {
            return s;
        }

        char[] chars = s.toCharArray();

        int numCnt = 0;
        int charCnt = 0;
        for (int i = 0; i< chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                numCnt++;
            } else {
                charCnt++;
            }
        }

        if (numCnt == 0 || charCnt == 0) {
            return "";
        }

        if (Math.abs(numCnt - charCnt) > 1) {
            return "";
        }

        char[] numArr = new char[numCnt];
        char[] charArr = new char[charCnt];

        for (int i = 0, j = 0, k = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                numArr[j++] = chars[i];
            } else {
                charArr[k++] = chars[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (numArr.length >= charCnt) {
                sb.append(i % 2 == 0 ? numArr[i / 2] :  charArr[i / 2]);
            } else {
                sb.append(i % 2 == 0 ? charArr[i / 2] : numArr[i / 2]);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
//        String text = "a0b1c2";
        String text = "a12bcd";
        String result = s.reformat(text);
        System.out.println("result = " + result);
    }
}