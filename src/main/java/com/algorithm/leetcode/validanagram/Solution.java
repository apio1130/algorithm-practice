package com.algorithm.leetcode.validanagram;

import java.util.Arrays;

/**
 * 242. Valid Anagram
 *
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        String sortedS = String.valueOf(sArr);
        String sortedT = String.valueOf(tArr);

        return sortedS.equals(sortedT);
    }
}
