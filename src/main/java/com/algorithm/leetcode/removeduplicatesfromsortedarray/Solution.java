package com.algorithm.leetcode.removeduplicatesfromsortedarray;

import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] result = Arrays.stream(nums).distinct().toArray();
        for (int i = 0; i < result.length; i++) {
            nums[i] = result[i];
        }
        return result.length;
    }
}