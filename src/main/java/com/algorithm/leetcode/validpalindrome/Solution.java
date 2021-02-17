package com.algorithm.leetcode.validpalindrome;

/**
 * 125. Valid Palindrome
 */
class Solution {
    public boolean isPalindrome(String s) {
        String convertedText = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int length = convertedText.length();

        for(int i = 0; i < length / 2; i++) {
            if (convertedText.charAt(i) != convertedText.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String text = "A man, a plan, a canal: Panama";
        System.out.println(s.isPalindrome(text));
    }
}
