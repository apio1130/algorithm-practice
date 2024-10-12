package com.algorithm.leetcode.mergesortedarray;

import java.util.Arrays;

/**
 * 88. Merge Sorted Array
 */
public class Solution2 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int i = 0; i < n; i++) {
			nums1[m + i] = nums2[i];
		}
		Arrays.sort(nums1);
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
