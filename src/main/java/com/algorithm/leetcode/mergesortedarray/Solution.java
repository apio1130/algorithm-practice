package com.algorithm.leetcode.mergesortedarray;

import java.util.Arrays;

/**
 * 88. Merge Sorted Array
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Tail = m - 1;
        int nums2Tail = n - 1;

        while (nums1Tail >= 0 && nums2Tail >= 0) {
            nums1[nums1Tail + nums2Tail + 1] = nums1[nums1Tail] > nums2[nums2Tail] ? nums1[nums1Tail--] : nums2[nums2Tail--];
        }
        while (nums2Tail >= 0) {
            nums1[nums1Tail + nums2Tail + 1] = nums2[nums2Tail--];
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = {1,2,3,0,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6,7};
        int n = 4;

        s.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
