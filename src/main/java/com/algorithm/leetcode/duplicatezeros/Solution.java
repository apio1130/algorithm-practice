package com.algorithm.leetcode.duplicatezeros;

import java.util.Arrays;

/**
 * 1089. Duplicate Zeros
 */
class Solution {
    public void duplicateZeros(int[] arr) {
        int[] tempArr = Arrays.copyOf(arr, arr.length);
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int i = 0; (i + idx) < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                arr[i + idx] = 0;
                if (i + idx + 1 < arr.length) {
                    arr[i + idx + 1] = 0;
                }
                idx++;
            } else {
                arr[i + idx] = tempArr[i];
            }
        }
    }

    public static void main(String... args) {
        Solution s = new Solution();
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        s.duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
