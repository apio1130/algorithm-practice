package com.algorithm.leetcode.numberof1bits;

import java.util.Arrays;

/**
 * 191. Number of 1 Bits
 *
 */
class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        String binaryTxt = Integer.toBinaryString(n);
        count = (int) Arrays.stream(binaryTxt.split("")).filter("1"::equals).count();
        return count;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int numb = 10;
        System.out.println(s.hammingWeight(numb));
    }
}