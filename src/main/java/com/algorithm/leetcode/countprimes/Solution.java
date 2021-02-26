package com.algorithm.leetcode.countprimes;

class Solution {
    public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }

        boolean[] arr = new boolean[n];
        arr[0] = true;
        arr[1] = true;

        int count = n - 2;
        for (int i = 2; i < n; i++) {
            for (int j = 2; j * i < n; j++) {
                if (!arr[j * i]) {
                    arr[j * i] = true;
                    count--;
                }
            }
        }

        return count;
    }
}
