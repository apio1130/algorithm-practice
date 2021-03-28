package com.algorithm.leetcode.countthenumberofconsistentstrings;

/**
 * 1684. Count the Number of Consistent Strings
 */
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            boolean isAllow = true;
            for (char c : word.toCharArray()) {
                if (allowed.indexOf(c) == -1) {
                    isAllow = false;
                    break;
                }
            }
            if (isAllow) {
                count++;
            }
        }

        return count;
    }
}
