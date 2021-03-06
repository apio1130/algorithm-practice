package com.algorithm.leetcode.ransomnote;

/**
 * 383. Ransom Note
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] countArr = new int[26];
        for (char c : magazine.toCharArray()) {
            countArr[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (--countArr[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String ransomNote = "aabb";
        String magazine = "bbaa";
        System.out.println(s.canConstruct(ransomNote, magazine));
    }
}