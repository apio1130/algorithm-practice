package com.algorithm.leetcode.addstrings;

/**
 * 415. Add Strings
 */
class Solution {
    public String addStrings(String num1, String num2) {
        char[] num1Arr = num1.toCharArray();
        char[] num2Arr = num2.toCharArray();
        StringBuilder sb = new StringBuilder();

        if (num1Arr.length >= num2Arr.length) {
            sum(num1Arr, num2Arr, sb);
        } else {
            sum(num2Arr, num1Arr, sb);
        }

        return sb.reverse().toString();
    }

    private void sum(char[] largeNumArr, char[] smallNumArr, StringBuilder sb) {
        int buffer = 0;
        int diff = largeNumArr.length - smallNumArr.length;
        for (int i = smallNumArr.length - 1; i > -1; i--) {
            int nVal1 = largeNumArr[i + diff] - '0';
            int nVal2 = smallNumArr[i] - '0';
            int sum = nVal1 + nVal2 + buffer;
            if (sum > 9) {
                buffer = 1;
            } else {
                buffer = 0;
            }
            sb.append(sum % 10);
        }
        for (int i = largeNumArr.length - smallNumArr.length - 1; i > -1; i--) {
            int sum = largeNumArr[i] - '0' + buffer;
            if (sum > 9) {
                buffer = 1;
            } else {
                buffer = 0;
            }
            sb.append(sum % 10);
        }
        if (buffer > 0) {
            sb.append(buffer);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String num1 = "9";
        String num2 = "99";
        System.out.println(solution.addStrings(num1, num2));
    }
}