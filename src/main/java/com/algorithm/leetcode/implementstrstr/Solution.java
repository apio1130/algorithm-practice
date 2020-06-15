package com.algorithm.leetcode.implementstrstr;

/**
 *  28. Implement strStr()
 */
class Solution {
    public int strStr(String haystack, String needle) {
        int result = -1;
        if (needle.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            for(int j = 0; j < needle.length(); j++) {
                if ((i+j) == haystack.length()) {
                    return -1;
                }
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                }
                if (j == needle.length()-1) {
                    return i;
                }
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
//        String haystack = "hello";
        String haystack = "mississippi";
//        String needle = "ll";
        String needle = "a";
        
        System.out.println(s.strStr(haystack, needle));
    }
}
