package com.algorithm.leetcode.decompressrunlengthencodedlist;

/**
 * 1313. Decompress Run-Length Encoded List
 */
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            size += nums[2 * i];
        }
        int[] result = new int[size];
        int start = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            int freq = nums[2 * i];
            int val = nums[2 * i + 1];
            for (int j = 0; j < freq; j++) {
                result[start + j] = val;
            }
            start += freq;
        }
        return result;
    }
}