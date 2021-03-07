package com.algorithm.leetcode.findthehighestaltitude;

/**
 * 1732. Find the Highest Altitude
 */
class Solution {
    public int largestAltitude(int[] gain) {
        int start = 0;
        int max = 0;

        for (int a : gain) {
            start += a;
            if (max < start) {
                max = start;
            }
        }
        return max;
    }
}
