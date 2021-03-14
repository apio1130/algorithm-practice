package com.algorithm.leetcode.richestcustomerwealth;

/**
 * 1672. Richest Customer Wealth
 */
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int[] account : accounts) {
            int temp = 0;
            for (int i : account)
                temp += i;
            max = Math.max(max, temp);
        }

        return max;
    }
}