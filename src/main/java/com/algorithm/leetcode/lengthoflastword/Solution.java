package com.algorithm.leetcode.lengthoflastword;

/**
 * 58. Length of Last Word
 *
 */
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr.length > 0 ? arr[arr.length - 1].length() : 0;
    }
}
