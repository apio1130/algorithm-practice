package com.algorithm.leetcode.checkifonestringswapcanmakestringsequal;

/**
 * 1790. Check if One String Swap Can Make Strings Equal
 */
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        int idx1 = -1;
        int idx2 = -1;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (idx1 == -1) {
                    idx1 = i;
                } else if (idx2 == -1) {
                    idx2 = i;
                } else {
                    return false;
                }
            }
        }

        if (idx1 == -1 || idx2 == -1) {
            return false;
        }

        char[] chars = s1.toCharArray();
        char temp = chars[idx1];
        chars[idx1] = chars[idx2];
        chars[idx2] = temp;

        return String.valueOf(chars).equals(s2);
    }

    public static void main(String... args) {
        Solution s = new Solution();

        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(s.areAlmostEqual(s1, s2));
    }
}