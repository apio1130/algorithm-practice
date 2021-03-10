package com.algorithm.leetcode.findnumberswithevennumberofdigits;

import java.util.Arrays;

/**
 * 1295. Find Numbers with Even Number of Digits
 */
class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        // sol.1
        result = (int)Arrays.stream(nums).mapToObj(Integer::toString).filter(s -> s.length() % 2 == 0).count();

        result = 0;
        // sol.2
        for (int n : nums) {
            if (Integer.toString(n).length() % 2 == 0)
                result++;
        }
        return result;
    }
}
