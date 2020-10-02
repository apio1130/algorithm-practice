package com.algorithm.leetcode.longestcommonprefix;

/**
 * Longest Common Prefix
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        
        if (strs.length == 1) {
            return strs[0];
        }
        
        
        String str = strs[0];
        StringBuilder sb = new StringBuilder();

        boolean isSame = true;
        for (int i = 0; i < str.length(); i++) {
            for(int j = 1; j < strs.length; j++) {
                String s = strs[j];
                if (s.length() < (i+1)) {
                    isSame = false;
                    break;
                }
                if (str.charAt(i) != s.charAt(i)) {
                    isSame = false;
                    break;
                }
                if (j == (strs.length-1)) {
                    sb.append(s.charAt(i));
                }
            }

            if (!isSame) {
                break;
            }
        }

        return sb.toString();
    }
}