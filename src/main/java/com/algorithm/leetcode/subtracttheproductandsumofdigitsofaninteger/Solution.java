package com.algorithm.leetcode.subtracttheproductandsumofdigitsofaninteger;

/**
 * 1281. Subtract the Product and Sum of Digits of an Integer
 */
class Solution {
    public int subtractProductAndSum(int n) {
        int result;
        int length = Integer.toString(n).length();
        int[] arr = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            int mod = n % 10;
            n /= 10;
            arr[i] = mod;
        }

        int multiply = 1;
        int sum = 0;
        for (int num : arr) {
            multiply *= num;
            sum += num;
        }

        result = multiply - sum;
        return result;
    }
}