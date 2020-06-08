package com.algorithm.leetcode.palindromenumber;

/**
 * 9. Palindrome Number
 *
 */
class Solution {
    public boolean isPalindrome(int x) {
        String text = String.valueOf(x);
        int length = text.length();
        for(int i = 0; i < length / 2; i++) {
            char head = text.charAt(i);
            char tail = text.charAt(length - i -1);
            if (head != tail) {
                return false;
            }
        }

        return true;
    }
}