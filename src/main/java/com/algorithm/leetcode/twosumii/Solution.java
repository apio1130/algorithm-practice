package com.algorithm.leetcode.twosumii;

import java.util.Arrays;

/**
 * 167. Two Sum II - Input array is sorted
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        loop:
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int temp = numbers[i] + numbers[j];
                if (temp == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    break loop;
                }
                if (temp > target) {
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(s.twoSum(numbers, target)));;
    }
}
