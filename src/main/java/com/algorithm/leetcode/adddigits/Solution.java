package com.algorithm.leetcode.adddigits;

/**
 * 258. Add Digits
 *
 */
class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        int temp = num;
        int sum = 0;
        for (int i = 0; i < Integer.toString(num).length(); i++) {
            sum += temp % 10;
            temp  /= 10;
        }
        
        return addDigits(sum);
    }
    
    public static void main(String[] args) {
        Solution  s = new Solution();
        System.out.println(s.addDigits(38));
    }
}
