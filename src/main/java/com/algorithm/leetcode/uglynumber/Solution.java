package com.algorithm.leetcode.uglynumber;

class Solution {
    public boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        int[] arr = {2,3,5};
        for (int n : arr) {
            while (num % n == 0) {
                num = num / n;
            }
        }
        return num == 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int num = -2147483648;
        System.out.println(s.isUgly(num));
    }
}