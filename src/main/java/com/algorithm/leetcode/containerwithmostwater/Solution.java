package com.algorithm.leetcode.containerwithmostwater;

/**
 * 11. Container With Most Water
 */
class Solution {
    public int maxArea(int[] height) {
        // int max = 0;
        // for (int i = 0; i < height.length - 1; i++) {
        //     for (int j = i + 1; j < height.length; j++) {
        //         int x = j - i;
        //         int y = Math.min(height[i], height[j]);
        //         if (x * y > max) {
        //             max = x * y;
        //         }
        //     }
        // }

        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int water = (right - left) * Math.min(height[left], height[right]);
            if (water > max) max = water;
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] data = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(s.maxArea(data));
    }
}
