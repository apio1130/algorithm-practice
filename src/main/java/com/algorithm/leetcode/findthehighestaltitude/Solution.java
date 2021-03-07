package com.algorithm.leetcode.findthehighestaltitude;

/**
 * 1732. Find the Highest Altitude
 */
class Solution {
    public int largestAltitude(int[] gain) {
        int start = 0;
        int max = 0;

        for (int a : gain) {
            max = Math.max(start += a, max);
        }
        return max;
    }
}
