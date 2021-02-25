package com.algorithm.leetcode.longestsubstringwithoutrepeatingcharacters;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. Longest Substring Without Repeating Characters
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int idxA = 0;
        int idxB = 0;

        Set<Character> set = new HashSet<>();
        while(idxA < s.length()) {
            char at = s.charAt(idxA);
            if (!set.contains(at)) {
                set.add(s.charAt(idxA++));
                maxLength = Math.max(maxLength, set.size());
            } else {
                set.remove(s.charAt(idxB++));
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String txt = "aab";
        System.out.println(s.lengthOfLongestSubstring(txt));
    }
}
