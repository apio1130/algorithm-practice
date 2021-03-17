package com.algorithm.leetcode.shufflestring;

/**
 * 1528. Shuffle String
 */
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] chars = s.toCharArray();
        char[] result = new char[chars.length];

        for (int i = 0; i < result.length; i++) {
            result[indices[i]] = chars[i];
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String text = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(s.restoreString(text, indices));
    }
}
