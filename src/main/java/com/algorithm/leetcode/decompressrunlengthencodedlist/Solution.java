package com.algorithm.leetcode.decompressrunlengthencodedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * 1313. Decompress Run-Length Encoded List
 */
class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length / 2; i++) {
            for (int j = 0; j < nums[2 * i]; j++) {
                list.add(nums[2 * i + 1]);
            }
        }

        return list.stream().mapToInt(n -> n).toArray();
    }
}