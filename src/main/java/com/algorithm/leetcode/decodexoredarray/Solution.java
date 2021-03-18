package com.algorithm.leetcode.decodexoredarray;

import java.util.Arrays;

/**
 * 1720. Decode XORed Array
 */
class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] decode = new int[encoded.length + 1];
        decode[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            decode[i+1] = encoded[i] ^ decode[i];
        }

        return decode;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] encoded = {1,2,3};
        int first = 1;
        System.out.println(Arrays.toString(s.decode(encoded, first)));
    }
}