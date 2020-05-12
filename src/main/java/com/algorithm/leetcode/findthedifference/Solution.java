package com.algorithm.leetcode.findthedifference;

/**
 * 389. Find the Difference
 *
 */
class Solution {
    public char findTheDifference(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        
        
        char result = 0;
        
        for(int i = 0; i < sArr.length; i++) {
            result ^= sArr[i];
        }
        
        for(int i = 0; i < tArr.length; i++) {
            result ^= tArr[i];
        }
        
        return result;
    }
}
