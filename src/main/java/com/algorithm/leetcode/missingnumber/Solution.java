package com.algorithm.leetcode.missingnumber;

import java.util.stream.IntStream;

/**
 * 268. Missing Number
 *
 */
class Solution {
    public int missingNumber(int[] nums) {
        int sum = IntStream.of(nums).sum();
        int n = nums.length;
        int maxSum = (1 + n) * n / 2;
        return maxSum - sum;
    }
}