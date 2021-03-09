package com.algorithm.leetcode.sumofalloddlengthsubarrays;

/**
 * 1588. Sum of All Odd Length Subarrays
 */
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int buf = 1;
        int sum = 0;
        while (arr.length / buf > 0) {
            for (int i = 0; i <= arr.length - buf; i++) {
                for (int j = i; j < i + buf; j++) {
                    sum += arr[j];
                }
            }
            buf += 2;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(s.sumOddLengthSubarrays(arr));
    }
}