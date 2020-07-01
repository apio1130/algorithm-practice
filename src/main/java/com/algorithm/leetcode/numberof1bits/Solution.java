package com.algorithm.leetcode.numberof1bits;

/**
 * 191. Number of 1 Bits
 *
 */
class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int numb = n;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            int temp = numb & 1;
            if (temp == 1) {
                count++;
            }
            numb >>= 1;
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int numb = 10;
        System.out.println(s.hammingWeight(numb));
    }
}