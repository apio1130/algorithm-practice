package com.algorithm.leetcode.tolowercase;

/**
 * 709. To Lower Case
 *
 */
class Solution {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            int codePoint = c; 
            if (codePoint < 91 && codePoint > 64) {
                sb.append(Character.toChars(codePoint + 32));
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.toLowerCase("AaBbCcZz"));
    }
}
