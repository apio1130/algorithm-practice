package com.algorithm.leetcode.ransomnote;

/**
 * 383. Ransom Note
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] mgzArr = magazine.toCharArray();
        char[] rnArr = ransomNote.toCharArray();

        for (int i = 0; i < rnArr.length; i++) {
            char curr = rnArr[i];
            for (int j = 0; j < mgzArr.length; j++) {
                if (mgzArr[j] == curr) {
                    mgzArr[j] = ' ';
                    rnArr[i] = ' ';
                    break;
                }
            }
        }
        return new String(rnArr).trim().length() == 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String ransomNote = "aabb";
        String magazine = "cbaa";
        System.out.println(s.canConstruct(ransomNote, magazine));
    }
}