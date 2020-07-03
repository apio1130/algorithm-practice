package com.algorithm.leetcode.poweroftwo;

/**
 * 231. Power of Two
 *
 */
class Solution {
    public boolean isPowerOfTwo(int n) {
        
        return n > 0 && Integer.bitCount(n) == 1;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPowerOfTwo(4));
    }
}