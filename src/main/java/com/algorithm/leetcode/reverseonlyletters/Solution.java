package com.algorithm.leetcode.reverseonlyletters;

/**
 * 917. Reverse Only Letters
 */
class Solution {
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();

        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char lc = chars[left];
            if (Character.isLetter(lc)) {
                char rc = chars[right];
                while (!Character.isLetter(rc)) {
                    rc = chars[--right];
                }
                chars[left] = chars[right];
                chars[right] = lc;
                right--;
            }
            left++;
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        // String S = "ab-cd";
        String S = "a-bC-dEf-ghIj";
        System.out.println(s.reverseOnlyLetters(S));
    }
}
