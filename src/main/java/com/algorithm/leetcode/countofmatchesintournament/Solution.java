package com.algorithm.leetcode.countofmatchesintournament;

/**
 * 1688. Count of Matches in Tournament
 */
class Solution {
    public int numberOfMatches(int n) {
        int result = 0;
        while (n > 1) {
            int matches = n / 2;
            if (n % 2 == 0) {
                n = matches;
            } else {
                n = matches + 1;
            }
            result += matches;
        }
        return result;
    }
}
