package com.algorithm.leetcode.findnuniqueintegerssumuptozero;

import java.util.Arrays;

/**
 * 1304. Find N Unique Integers Sum up to Zero
 */
class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int idx = 0;
        if (n % 2 == 1) {
            idx += 1;
            arr[0] = 0;
        }

        for (int val = 1; idx < n; idx++, val++) {
            arr[idx] = val;
            if (idx + 1 < n) {
                arr[idx + 1] = val * -1;
                idx++;
            }
        }
        return arr;
    }

    public static void main(String... args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString((s.sumZero(3))));
    }
}
