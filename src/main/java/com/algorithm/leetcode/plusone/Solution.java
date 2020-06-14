package com.algorithm.leetcode.plusone;

/**
 * 66. Plus One
 */
class Solution {
    public int[] plusOne(int[] digits) {
        boolean isCarry = false;
        for(int i = digits.length -1; i >= 0; i--) {
            int temp = digits[i] + 1;
            isCarry = temp > 9;
            digits[i] = temp % 10;
            if (!isCarry) {
                break;
            }
        }
        if(isCarry) {
            int[] copyArr = new int[digits.length +1];
            for (int i = 0; i < digits.length; i++) {
                copyArr[i+1] = digits[i];
            }
            copyArr[0] = 1;
            digits = copyArr;
        }

        return digits;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] digits = {9,9,9};
        s.plusOne(digits);
    }
}
