package com.algorithm.leetcode.reversevowelsofastring;

/**
 * 345. Reverse Vowels of a String
 */
class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (isVowel(chars[left])){
                for(; right > left; right--) {
                    if (isVowel(chars[right])){
                        swap(chars, left, right);
                        right--;
                        break;
                    }
                }
            }
            left++;
        }
        return new String(chars);
    }

    private void swap(char[] chars, int left, int i) {
        char temp = chars[i];
        chars[i] = chars[left];
        chars[left] = temp;
    }

    private boolean isVowel(char aChar) {
        final char[] vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char c : vowel) {
            if (c == aChar) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution  = new Solution();
        String s = "leetcode";
        System.out.println(solution.reverseVowels(s));
    }
}
